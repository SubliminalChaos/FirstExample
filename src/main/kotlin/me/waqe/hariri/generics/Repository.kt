package me.waqe.hariri.generics

import me.waqe.hariri.inheritance.Customer

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    // this is redundant, because I no longer need to call this a
    // CustomerGenericRepository, because the type parameter is
    // telling us what type of repository it is
    val customerRepo1 = CustomerGenericRepository<Customer>()
    // therefore
    //val customerRepo2 = GenericRepository<Customer>()
}
