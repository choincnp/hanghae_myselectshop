package com.sparta.myselectshopbeta.naver.controller;


import com.sparta.myselectshopbeta.naver.dto.ItemDto;
import com.sparta.myselectshopbeta.naver.service.NaverApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class NaverApiController {

    private final NaverApiService naverApiService;

    @GetMapping("/search")
    public List<ItemDto> searchItems(@RequestParam String query)  {
        return naverApiService.searchItems(query);
    }
}