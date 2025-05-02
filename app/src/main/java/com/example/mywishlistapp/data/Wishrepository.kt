package com.example.mywishlistapp.data

import kotlinx.coroutines.flow.Flow

class WishRepository(private val wishDao: WishDao) {

    suspend fun addWish(wish: Wish){
        wishDao.addAWish(wish)
    }

    fun getWishes (): Flow<List<Wish>> = wishDao.getAllWishes()

    fun getAWishById (id: Long): Flow<Wish>{
        return wishDao.getAaWishById(id)
    }

    suspend fun updateWish(wish: Wish){
        wishDao.updateWish(wish)
    }

    suspend fun deleteWish(wish: Wish){
        wishDao.deleteWish(wish)
    }
}