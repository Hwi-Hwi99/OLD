/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multi.threading_online_3;

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
