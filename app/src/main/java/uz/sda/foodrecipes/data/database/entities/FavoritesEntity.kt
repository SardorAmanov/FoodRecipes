package uz.sda.foodrecipes.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.sda.foodrecipes.models.Result
import uz.sda.foodrecipes.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)