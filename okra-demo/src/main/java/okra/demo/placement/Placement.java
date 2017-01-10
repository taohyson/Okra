/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package okra.demo.placement;

import org.ogcs.okra.example.game.persistence.domain.MemRole;
import org.ogcs.okra.example.game.persistence.mapper.ExampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 放置类
 *
 * @author TinyZ
 * @date 2016-07-15.
 */
@Service("placement")
public class Placement {

    private int target;

    @Autowired
    private ExampleMapper exampleMapper;

    public Placement() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                initialize();
            }
        }).start();
    }

    public void initialize() {
        MemRole memRole = exampleMapper.select("");

        System.out.println();
    }


}
