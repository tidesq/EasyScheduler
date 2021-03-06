/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.escheduler.common.model;

import java.util.Date;

/**
 * date interval class
 */
public class DateInterval {

    private Date startTime;

    private Date endTime;

    public DateInterval(Date beginTime, Date endTime){
        this.startTime = beginTime;
        this.endTime = endTime;

    }

    @Override
    public boolean equals(Object obj) {
        try{
            DateInterval dateInterval = (DateInterval) obj;
            return startTime.equals(dateInterval.getStartTime()) &&
                    endTime.equals(dateInterval.getEndTime());
        }catch (Exception e){
            return false;
        }
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
