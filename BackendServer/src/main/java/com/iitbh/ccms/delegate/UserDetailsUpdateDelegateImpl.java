package com.iitbh.ccms.delegate;

import com.iitbh.ccms.api.UserDetailsUpdateApiDelegate;
import com.iitbh.ccms.model.UserInfo;
import com.iitbh.ccms.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsUpdateDelegateImpl implements UserDetailsUpdateApiDelegate {

    private final UsersService userDetailsService;

    @Autowired
    public UserDetailsUpdateDelegateImpl(UsersService userDetailUpdateService) {
        this.userDetailsService = userDetailUpdateService;
    }

    @Override
    public ResponseEntity<Void> userDetailUpdate(UserInfo userInfo) {
        if (userDetailsService.updateUserDetails(userInfo.getUserId(), userInfo)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
