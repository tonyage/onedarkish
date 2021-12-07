package com.github.tonyage.onedarkish.services

import com.intellij.openapi.project.Project
import com.github.tonyage.onedarkish.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
