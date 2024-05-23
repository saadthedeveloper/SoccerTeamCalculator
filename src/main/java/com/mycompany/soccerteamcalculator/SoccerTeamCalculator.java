/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soccerteamcalculator;
import javax.swing.JOptionPane;

/*This program calculates the number of soccer teams that a youth league may create from the number of
 * available players. Input validation is demonstrated with while loops.
 * @author MKAY
 */
public class SoccerTeamCalculator {

    public static void main(String[] args) {
        //Variable declarations below
        final int MIN_TEAM_MEMBERS = 9;
        final int MAX_TEAM_MEMBERS = 15;
        int players;
        int leftOver;
        int teams;
        int numberOfMembersPerTeam;
        String input;
        //Variable declarations above
        
        //Number of players available
        input = JOptionPane.showInputDialog("Enter the total number of players");
        players = Integer.parseInt(input);
             
        //validation below 
        while(players<=0)
        {
            input = JOptionPane.showInputDialog("Enter the total number of players (input can't be zero or below)");
            players = Integer.parseInt(input);
        }
        
   
        //Number of players per team
        input = JOptionPane.showInputDialog("Enter the number of players per team");
        numberOfMembersPerTeam = Integer.parseInt(input);
             
        //validation below 
        while(numberOfMembersPerTeam<9 || numberOfMembersPerTeam>15)
        {
            input = JOptionPane.showInputDialog("Enter the number of players per team (number of player should be between " + MAX_TEAM_MEMBERS + " and " + MIN_TEAM_MEMBERS + ")" );
            numberOfMembersPerTeam = Integer.parseInt(input);
        }
    
        
        //calculation
        teams = players/numberOfMembersPerTeam;
        leftOver = players%numberOfMembersPerTeam;
        
        //Displaying number of team(s) and any left over players
        JOptionPane.showMessageDialog(null, "There will be " +
                                          teams + " team(s) with " +
                                          leftOver +
                                          " players left over.");
        
       
    }
}
