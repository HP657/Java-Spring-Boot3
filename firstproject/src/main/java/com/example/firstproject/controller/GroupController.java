//package com.example.firstproject.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class GroupController {
//    @Autowired
//    private GroupService groupService;
//    @Autowired
//    private  TeamService teamService;
//
//    @GetMapping("/groups/{groupId")
//    public  String show(@PathVariable Long groupId, Model model) {
//        GroupDto groupDto = groupService.getGroup(groupId);
//        List<TeamDto> teamDtos = teamService.getTeamsOnGroup(groupId);
//        model.addAttribute("groupname", groupDto.getName());
//        model.addAttribute("teamDtoList", teamDtos);
//        return "groups/show";
//    }
//}
