class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int current_time = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        int op_start_time = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        int op_end_time = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        int video_time = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        if(current_time >= op_start_time && current_time <= op_end_time) current_time = op_end_time;
        for(int i = 0; i < commands.length; i++){
            if(commands[i].equals("next")){
                current_time += 10;
                if(current_time > video_time) current_time = video_time;
                if(current_time >= op_start_time && current_time <= op_end_time) current_time = op_end_time;
            }
            else if(commands[i].equals("prev")){
                if(current_time < 10) current_time = 0;
                else current_time -= 10;
                
                if(current_time >= op_start_time && current_time <= op_end_time) current_time = op_end_time;
            }
        }
        if(current_time >= op_start_time && current_time <= op_end_time) current_time = op_end_time;
        String minutes = current_time / 60 + "";
        if(minutes.length() == 1) minutes = 0 + minutes;
        String seconds = current_time % 60 + "";
        if(seconds.length() == 1) seconds = 0 + seconds;
        
        return minutes + ":" + seconds;
    }
}