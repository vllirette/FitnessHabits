package com.strudelauxpommes.fitnesshabits.data.model.record;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by thomas on 2017-11-25.
 */

@Entity
public class FoodCategory {
    @PrimaryKey(autoGenerate = true)
    private int categoryId; //TODO: Implement model
}
