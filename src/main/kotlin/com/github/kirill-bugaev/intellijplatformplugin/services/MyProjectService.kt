package com.github.kirill-bugaev.intellijplatformplugin.services

import com.intellij.openapi.project.Project
import com.github.kirill-bugaev.intellijplatformplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
