package com.tdksky.androidmaster.tdksky.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal :TaskCategory()
    object Bussines :TaskCategory()
    object Other : TaskCategory()
}
