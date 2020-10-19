package com.yjzh.java.week3.cpu;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Pc
 * @Description TODO
 * @Author WL
 * @Date 2020/10/14
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Pc {
    private Cpu cpu;
    private HardDisk HD;

    public void setCPU(Cpu c)
    {
        this.cpu = c;
    }
    public void setHardDisk(HardDisk h) {
        this.HD = h;
    }
    public void show(){
        System.out.println("CPU的速度为："+cpu.toString()+",硬盘的大小为："+HD.toString());
    }
}