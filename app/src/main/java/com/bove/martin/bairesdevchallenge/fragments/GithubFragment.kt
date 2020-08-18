package com.bove.martin.bairesdevchallenge.fragments


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.bove.martin.bairesdevchallenge.R
import com.bove.martin.bairesdevchallenge.adapters.ProjectsAdapter
import com.bove.martin.bairesdevchallenge.model.Repository
import kotlinx.android.synthetic.main.fragment_github.*


class GithubFragment : Fragment(), ProjectsAdapter.OnItemClickListener {
    private lateinit var gitHubViewModel: GitHubFragmentViewModel
    private lateinit var projectsAdapter: ProjectsAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        gitHubViewModel = ViewModelProviders.of(activity!!).get(GitHubFragmentViewModel::class.java)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_github, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.subtitle = getString(R.string.github_subtitle)

        gitHubViewModel.getKotlinRepositories().observe(viewLifecycleOwner, Observer {
           if (it.items != null) {
               projectsAdapter = ProjectsAdapter(it.items!!, R.layout.repo_item, this)

               rvProjects.apply {
                   adapter = projectsAdapter
                   addItemDecoration(DividerItemDecoration(activity, DividerItemDecoration.VERTICAL))
                   layoutManager = LinearLayoutManager(activity , LinearLayoutManager.VERTICAL, false)
               }
           }
        })
    }

    override fun onItemClick(repository: Repository?, position: Int) {
        val i: Intent = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(repository?.htmlUrl);
        startActivity(i);
    }

}