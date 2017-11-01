package com.sd.campoc.controller;

import com.sd.campoc.service.user.UserService;
import com.sd.campoc.util.MessagesPropertiesUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author    : irfan nasim
 * @Date      : 22-May-17
 * @version   : ver. 1.0.0
 * 
 * ________________________________________________________________________________________________
 *
 *  Developer				Date		     Version		Operation		Description
 * ________________________________________________________________________________________________ 
 *	
 * 
 * ________________________________________________________________________________________________
 *
 * @Project   : BLCamPOC
 * @Package   : com.sd.campoc.controller
 * @FileName  : AdminAPI
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserAPI {

    public static final Logger logger = LoggerFactory.getLogger(UserAPI.class);

    @Autowired
    UserService userService;
    @Autowired
    MessagesPropertiesUtil messages;


}
