package com.bove.martin.bairesdevchallenge.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bove.martin.bairesdevchallenge.model.Repository
import com.bove.martin.bairesdevchallenge.utils.loadFromUrl
import kotlinx.android.synthetic.main.repo_item.view.*

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */
class ProjectsAdapter(private val repoList: List<Repository>, private val layout: Int, private val listener: OnItemClickListener) : RecyclerView.Adapter<ProjectsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(repoList[position], listener)
    }

    override fun getItemCount() = repoList.size

    // ViewHolder
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(repository: Repository, listener: OnItemClickListener) {
            itemView.ivRepoLogo.loadFromUrl(repository.owner?.avatarUrl as String)
            itemView.tvRepoName.text = repository.fullName
            itemView.tvRepoDesc.text = repository.description

            itemView.setOnClickListener { listener.onItemClick(repository, adapterPosition) }
        }
    }

    // Interfaz que define el onClick del adapter
    interface OnItemClickListener {
        fun onItemClick(repository: Repository?, position: Int)
    }
}
