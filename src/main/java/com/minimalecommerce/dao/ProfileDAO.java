package com.minimalecommerce.dao;

import com.minimalecommerce.entities.Profile;

public interface ProfileDAO {
    void create(Profile profile, int userId);
}
