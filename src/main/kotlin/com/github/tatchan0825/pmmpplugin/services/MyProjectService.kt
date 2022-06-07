package com.github.tatchan0825.pmmpplugin.services

import com.intellij.openapi.project.Project
import com.github.tatchan0825.pmmpplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
