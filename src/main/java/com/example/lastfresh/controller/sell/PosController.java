package com.example.lastfresh.controller.sell;

import com.example.lastfresh.domain.dto.PosDTO;
import com.example.lastfresh.domain.dto.PosPageDTO;
import com.example.lastfresh.domain.vo.Criteria;
import com.example.lastfresh.service.owner.PosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/pos/*")
public class PosController {
    private final PosService posService;

    @GetMapping("/list/{billStatus}")
    public ResponseEntity<PosPageDTO> getList(@PathVariable("billStatus") Long billStatus, Criteria criteria, HttpServletRequest request) {
        log.info("/pos/getList실행");
        log.info("criteria : " + criteria.toString() + billStatus);

        String status1 = null;
        String status2 = null;
        String status3 = null;

        if(billStatus == 0L) {
            status1 = "true";
        }else if (billStatus == 1L) {
            status2 = "true";
        }else if (billStatus == 2L) {
            status3 = "true";
        }

        HashMap<String, String> billStatuses = new HashMap<>();
        billStatuses.put("status1", status1);
        billStatuses.put("status2", status2);
        billStatuses.put("status3", status3);

        try {
            HashMap<String, Object> map = new HashMap<>();
            map.put("userNum", 6L);
            map.put("criteria", criteria);

            map.put("billStatus", billStatuses);

            // new ResponseEntity<>(posService.getListPreparing(map), HttpStatus.OK);
            log.info("pos-------------- " + posService.getTotalPreparing(map));
            // 정적 팩토리 메소드
            return ResponseEntity.ok(new PosPageDTO(posService.getTotalPreparing(map), posService.getListPreparing(map)));

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

    @GetMapping("/count/{billStatus}")
    public ResponseEntity<Integer> getCount(@PathVariable("billStatus") Long billStatus, HttpServletRequest request) {
        String status1 = null;
        String status2 = null;
        String status3 = null;

        if(billStatus == 0L) {
            status1 = "true";
        }else if (billStatus == 1L) {
            status2 = "true";
        }else if (billStatus == 2L) {
            status3 = "true";
        }

        HashMap<String, String> billStatuses = new HashMap<>();
        billStatuses.put("status1", status1);
        billStatuses.put("status2", status2);
        billStatuses.put("status3", status3);

        HashMap<String, Object> map = new HashMap<>();
        map.put("userNum", 6L);
        map.put("billStatus", billStatuses);

        return ResponseEntity.ok(posService.getTotalPreparing(map));
    }

    @PatchMapping(value = {"/accept"}, consumes = "application/json")
    public ResponseEntity<String> orderAccept(@RequestBody PosDTO posDTO){
        log.info("modify실행");
        log.info("modify실행 : " + posDTO.toString());
        return ResponseEntity.ok(posService.modifyBill(posDTO) ? "접수 완료" : "접수 실패");
    }

    @PatchMapping(value = {"/cancel"}, consumes = "application/json")
    public ResponseEntity<String> orderCancel(@RequestBody PosDTO posDTO){
        return ResponseEntity.ok(posService.cancelBill(posDTO) ? "주문취소 완료" : "주문취소 실패");
    }
}
