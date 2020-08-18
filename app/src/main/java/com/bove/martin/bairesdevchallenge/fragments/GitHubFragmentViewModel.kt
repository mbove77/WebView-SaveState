package com.bove.martin.bairesdevchallenge.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.bove.martin.bairesdevchallenge.repository.GitHubRepository
import com.bove.martin.bairesdevchallenge.model.SearchResult

/**
 * Created by Martín Bove on 17-Aug-20.
 * E-mail: mbove77@gmail.com
 */
class GitHubFragmentViewModel: ViewModel() {
    private val gitHubRepositoryRepository: GitHubRepository = GitHubRepository()
    private val kotlinRepos: LiveData<SearchResult>

    init {
        kotlinRepos = gitHubRepositoryRepository.kotlinRepositories!!
    }

    fun getKotlinRepositories(): LiveData<SearchResult> = kotlinRepos
}