/*
 *  Copyright (c) 2024 Abd-Elrahman Esam <abdelrahmanesam20000@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or modify it under
 *  the terms of the GNU General Public License as published by the Free Software
 *  Foundation; either version 3 of the License, or (at your option) any later
 *  version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY
 *  WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 *  PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with
 *  this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.ichi2.anki.tasks

import org.gradle.api.Project


fun Project.connectedPlayDebugAndroidTest() {
    afterEvaluate {
        tasks.named("connectedPlayDebugAndroidTest")
            .configure { finalizedBy("assertNonzeroAndroidTests") }
    }
}