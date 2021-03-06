/**
 * Copyright 2014 Alexey Ragozin
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
package org.netbeans.lib.profiler.heap;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;

public class BaseHeapTest_WithHprofHeap extends BaseHeapTest {

    Heap heap;

    @Before
    public void initHeap() throws FileNotFoundException, IOException {
        heap = HeapFactory.createHeap(HeapDumpProcuder.getHeapDump());
    }

    @Override
    public Heap getHeap() {
        return heap;
    }
}
