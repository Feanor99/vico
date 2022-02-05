/*
 * Copyright (c) 2022. Patryk Goworowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package pl.patrykgoworowski.vico.compose.dimensions

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pl.patrykgoworowski.vico.core.dimensions.MutableDimensions

public fun dimensionsOf(all: Dp): MutableDimensions = dimensionsOf(
    start = all,
    top = all,
    end = all,
    bottom = all,
)

public fun dimensionsOf(
    horizontal: Dp = 0.dp,
    vertical: Dp = 0.dp,
): MutableDimensions = MutableDimensions(
    startDp = horizontal.value,
    topDp = vertical.value,
    endDp = horizontal.value,
    bottomDp = vertical.value,
)

public fun dimensionsOf(
    start: Dp = 0.dp,
    top: Dp = 0.dp,
    end: Dp = 0.dp,
    bottom: Dp = 0.dp,
): MutableDimensions = MutableDimensions(
    startDp = start.value,
    topDp = top.value,
    endDp = end.value,
    bottomDp = bottom.value,
)
