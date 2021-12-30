package uz.sda.foodrecipes.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.sda.foodrecipes.models.FoodRecipe
import uz.sda.foodrecipes.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}