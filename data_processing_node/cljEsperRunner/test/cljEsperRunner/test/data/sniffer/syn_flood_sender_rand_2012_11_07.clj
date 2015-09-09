;;;
;;;   
;;;   Copyright (C) 2015, Frankfurt University of Applied Sciences
;;;
;;;   This program is free software; you can redistribute it and/or modify it under the terms of the
;;;   GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
;;;   or (at your option) any later version.
;;;
;;;   This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
;;;   without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
;;;   See the GNU General Public License for more details.
;;;
;;;   You should have received a copy of the GNU General Public License along with this program;
;;;   if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
;;;
;;;
;;;   Linking this library statically or dynamically with other modules is making a combined work based on this library.
;;;   Thus, the terms and conditions of the GNU General Public License cover the whole combination.
;;;
;;;   As a special exception, the copyright holders of this library give you permission to link this library with
;;;   independent modules to produce an executable, regardless of the license terms of these independent modules,
;;;   and to copy and distribute the resulting executable under terms of your choice, provided that you also meet,
;;;   for each linked independent module, the terms and conditions of the license of that module. An independent module
;;;   is a module which is not derived from or based on this library. If you modify this library, you may extend
;;;   this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so,
;;;   delete this exception statement from your version.
;;;   
;;;
;;;
;;;   In addition, this software is also licensed under the terms of the Eclipse Public License 
;;;   (EPL) 1.0. You can find a copy of the EPL at: 
;;;   http://opensource.org/licenses/eclipse-1.0.php
;;;
;;;

(ns 
  ^{:author "Ruediger Gad",
    :doc "Sample data",
    :description "Sample data of a SYN flood generated with mausezahn.
The source IP address was randomized."
    :raw-file "syn_flood_sender_rand_2012-11-07.out"
    :date "2012-11-07"}
   cljEsperRunner.test.data.sniffer.syn-flood-sender-rand-2012-11-07)

(def data-set [
{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534877670000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55966,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314294,
  "seq" 1720005898,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534877927000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61599,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005905,
  "seq" 1665314294,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534877960000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55967,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314556,
  "seq" 1720005905,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534878692000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55968,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314556,
  "seq" 1720005905,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534878880000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61600,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005917,
  "seq" 1665314556,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302534918781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55969,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314559,
  "seq" 1720005917,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535378367000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55970,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314559,
  "seq" 1720005917,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535378620000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61601,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005924,
  "seq" 1665314559,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535378674000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55971,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314821,
  "seq" 1720005924,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535378730000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55972,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314821,
  "seq" 1720005924,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535378915000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61602,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005936,
  "seq" 1665314821,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535418813000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55973,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314824,
  "seq" 1720005936,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535879416000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55974,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665314824,
  "seq" 1720005936,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535879671000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61603,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005943,
  "seq" 1665314824,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535879755000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55975,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315086,
  "seq" 1720005943,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535879843000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55976,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315086,
  "seq" 1720005943,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535880023000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61604,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005955,
  "seq" 1665315086,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535919821000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55977,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315089,
  "seq" 1720005955,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302535961823000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536292892000, "wirelen" 172},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57592,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550505,
  "seq" 846279582,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536292935000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37978,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846279688,
  "seq" 2619550505,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536380653000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55978,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315089,
  "seq" 1720005955,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536380920000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61605,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005962,
  "seq" 1665315089,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536380952000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55979,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315351,
  "seq" 1720005962,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536381001000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55980,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315351,
  "seq" 1720005962,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536381190000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61606,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005974,
  "seq" 1665315351,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536420802000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55981,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315354,
  "seq" 1720005974,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536881673000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55982,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315354,
  "seq" 1720005974,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536881919000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61607,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005981,
  "seq" 1665315354,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536881952000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55983,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315616,
  "seq" 1720005981,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536882020000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55984,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315616,
  "seq" 1720005981,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536882196000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61608,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720005993,
  "seq" 1665315616,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302536921797000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55985,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315619,
  "seq" 1720005993,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537382811000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55986,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315619,
  "seq" 1720005993,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537383056000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61609,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006000,
  "seq" 1665315619,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537383087000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55987,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315881,
  "seq" 1720006000,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537383879000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55988,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315881,
  "seq" 1720006000,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537384072000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61610,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006012,
  "seq" 1665315881,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537423795000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55989,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315884,
  "seq" 1720006012,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537883605000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55990,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665315884,
  "seq" 1720006012,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537883864000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61611,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006019,
  "seq" 1665315884,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537883918000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55991,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316146,
  "seq" 1720006019,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537884085000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55992,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316146,
  "seq" 1720006019,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537884270000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61612,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006031,
  "seq" 1665316146,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537923786000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55993,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316149,
  "seq" 1720006031,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302537961766000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538384870000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55994,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316149,
  "seq" 1720006031,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538385108000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61613,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006038,
  "seq" 1665316149,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538385137000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55995,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316411,
  "seq" 1720006038,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538385878000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55996,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316411,
  "seq" 1720006038,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538386072000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61614,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006050,
  "seq" 1665316411,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538425801000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55997,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316414,
  "seq" 1720006050,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538885443000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55998,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316414,
  "seq" 1720006050,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538885691000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61615,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006057,
  "seq" 1665316414,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538885747000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 55999,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316676,
  "seq" 1720006057,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538885836000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56000,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316676,
  "seq" 1720006057,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538886014000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61616,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006069,
  "seq" 1665316676,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302538925793000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56001,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316679,
  "seq" 1720006069,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539386679000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56002,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316679,
  "seq" 1720006069,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539386929000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61617,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006076,
  "seq" 1665316679,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539386958000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56003,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316941,
  "seq" 1720006076,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539388071000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56004,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316941,
  "seq" 1720006076,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539388264000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61618,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006088,
  "seq" 1665316941,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539427796000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56005,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316944,
  "seq" 1720006088,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539887459000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56006,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665316944,
  "seq" 1720006088,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539887694000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61619,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006095,
  "seq" 1665316944,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539887724000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56007,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317206,
  "seq" 1720006095,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539888945000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56008,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317206,
  "seq" 1720006095,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539889137000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61620,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006107,
  "seq" 1665317206,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539928790000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56009,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317209,
  "seq" 1720006107,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302539961700000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540388766000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56010,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317209,
  "seq" 1720006107,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540389010000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61621,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006114,
  "seq" 1665317209,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540389060000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56011,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317471,
  "seq" 1720006114,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540389112000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56012,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317471,
  "seq" 1720006114,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540389295000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61622,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006126,
  "seq" 1665317471,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540428792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56013,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317474,
  "seq" 1720006126,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540890048000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56014,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317474,
  "seq" 1720006126,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540890292000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61623,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006133,
  "seq" 1665317474,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540890338000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56015,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317736,
  "seq" 1720006133,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540890386000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56016,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317736,
  "seq" 1720006133,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540890573000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61624,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006145,
  "seq" 1665317736,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302540929783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56017,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317739,
  "seq" 1720006145,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541314988000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541315317000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541391182000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56018,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665317739,
  "seq" 1720006145,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541391430000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61625,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006152,
  "seq" 1665317739,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541391484000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56019,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318001,
  "seq" 1720006152,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541391563000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56020,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318001,
  "seq" 1720006152,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541391754000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61626,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006164,
  "seq" 1665318001,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541431789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56021,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318004,
  "seq" 1720006164,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541892420000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56022,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318004,
  "seq" 1720006164,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541892663000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61627,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006171,
  "seq" 1665318004,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541892710000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56023,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318266,
  "seq" 1720006171,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541892774000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56024,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318266,
  "seq" 1720006171,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541892960000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61628,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006183,
  "seq" 1665318266,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541932807000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56025,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318269,
  "seq" 1720006183,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302541961671000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542081070000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542393433000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56026,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318269,
  "seq" 1720006183,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542393689000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61629,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006190,
  "seq" 1665318269,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542393740000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56027,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318531,
  "seq" 1720006190,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542393840000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56028,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318531,
  "seq" 1720006190,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542394024000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61630,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006202,
  "seq" 1665318531,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542433781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56029,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318534,
  "seq" 1720006202,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542894536000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56030,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318534,
  "seq" 1720006202,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542894782000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61631,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006209,
  "seq" 1665318534,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542894826000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56031,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318796,
  "seq" 1720006209,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542894873000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56032,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318796,
  "seq" 1720006209,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542895057000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61632,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006221,
  "seq" 1665318796,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302542934774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56033,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318799,
  "seq" 1720006221,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543395343000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56034,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665318799,
  "seq" 1720006221,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543395596000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61633,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006228,
  "seq" 1665318799,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543395628000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56035,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319061,
  "seq" 1720006228,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543395782000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56036,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319061,
  "seq" 1720006228,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543395966000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61634,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006240,
  "seq" 1665319061,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543435789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56037,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319064,
  "seq" 1720006240,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543896578000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56038,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319064,
  "seq" 1720006240,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543896824000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61635,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006247,
  "seq" 1665319064,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543896855000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56039,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319326,
  "seq" 1720006247,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543896917000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56040,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319326,
  "seq" 1720006247,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543897096000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61636,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006259,
  "seq" 1665319326,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543936792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56041,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319329,
  "seq" 1720006259,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302543961602000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544397740000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56042,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319329,
  "seq" 1720006259,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544397985000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61637,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006266,
  "seq" 1665319329,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544398012000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56043,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319591,
  "seq" 1720006266,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544398082000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56044,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319591,
  "seq" 1720006266,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544398262000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61638,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006278,
  "seq" 1665319591,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544437777000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56045,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319594,
  "seq" 1720006278,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544898752000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56046,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319594,
  "seq" 1720006278,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544898995000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61639,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006285,
  "seq" 1665319594,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544899028000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56047,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319856,
  "seq" 1720006285,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544899098000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56048,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319856,
  "seq" 1720006285,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544899281000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61640,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006297,
  "seq" 1665319856,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302544938778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56049,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319859,
  "seq" 1720006297,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545007211000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37979,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846279688,
  "seq" 2619550505,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545055997000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57593,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550595,
  "seq" 846279688,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545056049000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37980,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846279778,
  "seq" 2619550595,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545399884000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56050,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665319859,
  "seq" 1720006297,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545400136000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61641,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006304,
  "seq" 1665319859,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545400168000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56051,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320121,
  "seq" 1720006304,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545400864000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56052,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320121,
  "seq" 1720006304,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545401060000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61642,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006316,
  "seq" 1665320121,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545440774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56053,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320124,
  "seq" 1720006316,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545900265000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56054,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320124,
  "seq" 1720006316,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545900508000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61643,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006323,
  "seq" 1665320124,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545900556000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56055,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320386,
  "seq" 1720006323,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545900606000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56056,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320386,
  "seq" 1720006323,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545900784000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61644,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006335,
  "seq" 1665320386,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545940798000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56057,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320389,
  "seq" 1720006335,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302545961557000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546400923000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56058,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320389,
  "seq" 1720006335,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546401181000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61645,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006342,
  "seq" 1665320389,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546401249000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56059,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320651,
  "seq" 1720006342,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546401306000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56060,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320651,
  "seq" 1720006342,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546401489000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61646,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006354,
  "seq" 1665320651,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546440811000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56061,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320654,
  "seq" 1720006354,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546902164000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56062,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320654,
  "seq" 1720006354,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546902411000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61647,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006361,
  "seq" 1665320654,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546902459000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56063,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320916,
  "seq" 1720006361,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546902508000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56064,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320916,
  "seq" 1720006361,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546902696000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61648,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006373,
  "seq" 1665320916,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302546941819000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56065,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320919,
  "seq" 1720006373,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547402817000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56066,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665320919,
  "seq" 1720006373,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547403070000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61649,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006380,
  "seq" 1665320919,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547403134000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56067,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321181,
  "seq" 1720006380,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547403196000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56068,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321181,
  "seq" 1720006380,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547403381000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61650,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006392,
  "seq" 1665321181,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547442848000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56069,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321184,
  "seq" 1720006392,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547904128000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56070,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321184,
  "seq" 1720006392,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547904363000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61651,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006399,
  "seq" 1665321184,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547904390000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56071,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321446,
  "seq" 1720006399,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547904895000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56072,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321446,
  "seq" 1720006399,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547905101000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61652,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006411,
  "seq" 1665321446,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547944802000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56073,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321449,
  "seq" 1720006411,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302547961507000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548404757000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56074,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321449,
  "seq" 1720006411,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548405019000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61653,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006418,
  "seq" 1665321449,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548405074000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56075,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321711,
  "seq" 1720006418,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548405131000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56076,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321711,
  "seq" 1720006418,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548405314000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61654,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006430,
  "seq" 1665321711,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548444787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56077,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321714,
  "seq" 1720006430,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548906022000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56078,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321714,
  "seq" 1720006430,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548906267000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61655,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006437,
  "seq" 1665321714,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548906316000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56079,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321976,
  "seq" 1720006437,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548906368000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56080,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321976,
  "seq" 1720006437,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548906551000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61656,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006449,
  "seq" 1665321976,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302548945827000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56081,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321979,
  "seq" 1720006449,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549407172000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56082,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665321979,
  "seq" 1720006449,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549407416000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61657,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006456,
  "seq" 1665321979,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549407448000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56083,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322241,
  "seq" 1720006456,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549407523000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56084,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322241,
  "seq" 1720006456,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549407701000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61658,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006468,
  "seq" 1665322241,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549446771000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56085,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322244,
  "seq" 1720006468,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549907806000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56086,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322244,
  "seq" 1720006468,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549908053000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61659,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006475,
  "seq" 1665322244,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549908081000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56087,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322506,
  "seq" 1720006475,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549909390000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56088,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322506,
  "seq" 1720006475,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549909577000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61660,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006487,
  "seq" 1665322506,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549948778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56089,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322509,
  "seq" 1720006487,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302549961440000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550409194000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56090,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322509,
  "seq" 1720006487,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550409439000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61661,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006494,
  "seq" 1665322509,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550409471000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56091,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322771,
  "seq" 1720006494,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550409870000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56092,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322771,
  "seq" 1720006494,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550410059000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61662,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006506,
  "seq" 1665322771,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550449788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56093,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322774,
  "seq" 1720006506,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550910588000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56094,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665322774,
  "seq" 1720006506,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550910845000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61663,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006513,
  "seq" 1665322774,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550910903000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56095,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323036,
  "seq" 1720006513,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550910997000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56096,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323036,
  "seq" 1720006513,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550911176000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61664,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006525,
  "seq" 1665323036,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302550950810000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56097,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323039,
  "seq" 1720006525,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551372028000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.17.193",
  "source" "192.168.20.126",
  "id" 22936,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 42610,
  "ack" 836471650,
  "seq" 2156868800,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551372058000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.10.221",
  "source" "192.168.20.126",
  "id" 61310,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53605,
  "ack" 545821032,
  "seq" 1205897397,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551372071000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "64.12.30.49",
  "source" "192.168.20.126",
  "id" 3484,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53237,
  "ack" 459333794,
  "seq" 1609886860,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551411803000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56098,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323039,
  "seq" 1720006525,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551412058000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61665,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006532,
  "seq" 1665323039,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551412090000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56099,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323301,
  "seq" 1720006532,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551412152000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56100,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323301,
  "seq" 1720006532,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551412361000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61666,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006544,
  "seq" 1665323301,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551451789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56101,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323304,
  "seq" 1720006544,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551483572000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.17.193",
  "id" 6937,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 42610,
  "source" 443,
  "ack" 2156868806,
  "seq" 836471650,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551488134000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.10.221",
  "id" 28124,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53605,
  "source" 443,
  "ack" 1205897403,
  "seq" 545821032,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551488189000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "64.12.30.49",
  "id" 9509,
  "tos" 32,
  "ttl" 104,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53237,
  "source" 443,
  "ack" 1609886866,
  "seq" 459333794,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551912797000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56102,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323304,
  "seq" 1720006544,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551913041000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61667,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006551,
  "seq" 1665323304,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551913090000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56103,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323566,
  "seq" 1720006551,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551913138000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56104,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323566,
  "seq" 1720006551,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551913315000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61668,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006563,
  "seq" 1665323566,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551952799000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56105,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323569,
  "seq" 1720006563,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302551961400000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552413909000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56106,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323569,
  "seq" 1720006563,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552414165000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61669,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006570,
  "seq" 1665323569,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552414227000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56107,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323831,
  "seq" 1720006570,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552414319000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56108,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323831,
  "seq" 1720006570,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552414497000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61670,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006582,
  "seq" 1665323831,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552453799000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56109,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323834,
  "seq" 1720006582,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552915216000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56110,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665323834,
  "seq" 1720006582,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552915463000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61671,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006589,
  "seq" 1665323834,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552915490000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56111,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324096,
  "seq" 1720006589,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552917976000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56112,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324096,
  "seq" 1720006589,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552918174000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61672,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006601,
  "seq" 1665324096,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302552957785000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56113,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324099,
  "seq" 1720006601,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553415806000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56114,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324099,
  "seq" 1720006601,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553416055000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61673,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006608,
  "seq" 1665324099,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553416115000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56115,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324361,
  "seq" 1720006608,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553416179000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56116,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324361,
  "seq" 1720006608,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553416357000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61674,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006620,
  "seq" 1665324361,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553455786000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56117,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324364,
  "seq" 1720006620,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553916973000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56118,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324364,
  "seq" 1720006620,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553917218000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61675,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006627,
  "seq" 1665324364,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553917266000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56119,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324626,
  "seq" 1720006627,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553917315000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56120,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324626,
  "seq" 1720006627,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553917501000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61676,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006639,
  "seq" 1665324626,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553956773000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56121,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324629,
  "seq" 1720006639,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302553961357000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554318585000, "wirelen" 172},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57594,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550595,
  "seq" 846279778,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554318626000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37981,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846279884,
  "seq" 2619550595,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554418346000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56122,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324629,
  "seq" 1720006639,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554418601000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61677,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006646,
  "seq" 1665324629,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554418659000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56123,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324891,
  "seq" 1720006646,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554418720000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56124,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324891,
  "seq" 1720006646,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554418911000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61678,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006658,
  "seq" 1665324891,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554458808000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56125,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324894,
  "seq" 1720006658,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554919375000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56126,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665324894,
  "seq" 1720006658,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554919621000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61679,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006665,
  "seq" 1665324894,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554919678000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56127,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325156,
  "seq" 1720006665,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554919778000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56128,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325156,
  "seq" 1720006665,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554919978000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61680,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006677,
  "seq" 1665325156,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302554959783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56129,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325159,
  "seq" 1720006677,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555420592000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56130,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325159,
  "seq" 1720006677,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555420846000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61681,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006684,
  "seq" 1665325159,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555420877000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56131,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325421,
  "seq" 1720006684,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555421847000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56132,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325421,
  "seq" 1720006684,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555422033000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61682,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006696,
  "seq" 1665325421,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555461776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56133,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325424,
  "seq" 1720006696,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555921506000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56134,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325424,
  "seq" 1720006696,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555921767000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61683,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006703,
  "seq" 1665325424,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555921800000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56135,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325686,
  "seq" 1720006703,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555921944000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56136,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325686,
  "seq" 1720006703,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555922128000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61684,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006715,
  "seq" 1665325686,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555961303000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302555961788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56137,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325689,
  "seq" 1720006715,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556422828000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56138,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325689,
  "seq" 1720006715,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556423078000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61685,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006722,
  "seq" 1665325689,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556423107000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56139,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325951,
  "seq" 1720006722,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556423853000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56140,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325951,
  "seq" 1720006722,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556424046000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61686,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006734,
  "seq" 1665325951,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556463801000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56141,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325954,
  "seq" 1720006734,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556924213000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56142,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665325954,
  "seq" 1720006734,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556924458000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61687,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006741,
  "seq" 1665325954,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556924521000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56143,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326216,
  "seq" 1720006741,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556924615000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56144,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326216,
  "seq" 1720006741,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556924797000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61688,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006753,
  "seq" 1665326216,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302556964787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56145,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326219,
  "seq" 1720006753,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557228792000, "wirelen" 108},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56348,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 59871,
  "ack" 2902832861,
  "seq" 3371283422,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557229014000, "wirelen" 108},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 60217,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 59871,
  "source" 445,
  "ack" 3371283464,
  "seq" 2902832861,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557229053000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56349,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 445,
  "source" 59871,
  "ack" 2902832903,
  "seq" 3371283464,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557425409000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56146,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326219,
  "seq" 1720006753,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557425659000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61689,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006760,
  "seq" 1665326219,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557425690000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56147,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326481,
  "seq" 1720006760,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557427405000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56148,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326481,
  "seq" 1720006760,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557427596000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61690,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006772,
  "seq" 1665326481,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557466815000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56149,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326484,
  "seq" 1720006772,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557926105000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56150,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326484,
  "seq" 1720006772,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557926355000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61691,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006779,
  "seq" 1665326484,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557926413000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56151,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326746,
  "seq" 1720006779,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557926493000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56152,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326746,
  "seq" 1720006779,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557926669000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61692,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006791,
  "seq" 1665326746,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557961254000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302557965779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56153,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326749,
  "seq" 1720006791,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558427346000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56154,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665326749,
  "seq" 1720006791,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558427583000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61693,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006798,
  "seq" 1665326749,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558427611000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56155,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327011,
  "seq" 1720006798,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558429788000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56156,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327011,
  "seq" 1720006798,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558429986000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61694,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006810,
  "seq" 1665327011,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558469792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56157,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327014,
  "seq" 1720006810,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558789360000, "wirelen" 236},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57595,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550595,
  "seq" 846279884,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558789397000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37982,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846280054,
  "seq" 2619550595,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558928456000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56158,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327014,
  "seq" 1720006810,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558928708000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61695,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006817,
  "seq" 1665327014,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558928760000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56159,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327276,
  "seq" 1720006817,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558928816000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56160,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327276,
  "seq" 1720006817,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558929004000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61696,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006829,
  "seq" 1665327276,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302558968785000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56161,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327279,
  "seq" 1720006829,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559429651000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56162,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327279,
  "seq" 1720006829,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559429894000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61697,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006836,
  "seq" 1665327279,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559429936000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56163,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327541,
  "seq" 1720006836,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559429984000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56164,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327541,
  "seq" 1720006836,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559430167000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61698,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006848,
  "seq" 1665327541,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559469796000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56165,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327544,
  "seq" 1720006848,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559930709000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56166,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327544,
  "seq" 1720006848,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559930959000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61699,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006855,
  "seq" 1665327544,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559931020000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56167,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327806,
  "seq" 1720006855,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559931087000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56168,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327806,
  "seq" 1720006855,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559931266000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61700,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006867,
  "seq" 1665327806,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559961200000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302559970776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56169,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327809,
  "seq" 1720006867,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560431866000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56170,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665327809,
  "seq" 1720006867,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560432110000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61701,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006874,
  "seq" 1665327809,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560432142000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56171,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328071,
  "seq" 1720006874,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560432828000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56172,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328071,
  "seq" 1720006874,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560433018000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61702,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006886,
  "seq" 1665328071,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560472802000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56173,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328074,
  "seq" 1720006886,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560932491000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56174,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328074,
  "seq" 1720006886,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560932732000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61703,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006893,
  "seq" 1665328074,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560932766000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56175,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328336,
  "seq" 1720006893,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560935084000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56176,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328336,
  "seq" 1720006893,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560935276000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61704,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006905,
  "seq" 1665328336,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302560974818000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56177,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328339,
  "seq" 1720006905,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561433994000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56178,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328339,
  "seq" 1720006905,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561434236000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61705,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006912,
  "seq" 1665328339,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561434291000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56179,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328601,
  "seq" 1720006912,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561434368000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56180,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328601,
  "seq" 1720006912,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561434546000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61706,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006924,
  "seq" 1665328601,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561473796000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56181,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328604,
  "seq" 1720006924,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561935091000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56182,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328604,
  "seq" 1720006924,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561935349000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61707,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006931,
  "seq" 1665328604,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561935398000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56183,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328866,
  "seq" 1720006931,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561935448000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56184,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328866,
  "seq" 1720006931,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561935634000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61708,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006943,
  "seq" 1665328866,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561961131000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302561974774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56185,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328869,
  "seq" 1720006943,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562325245000, "wirelen" 220},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57596,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550595,
  "seq" 846280054,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562325281000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37983,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846280208,
  "seq" 2619550595,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562403939000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 36663,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 39392}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562403960000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 36664,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 53, "source" 39392}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562436239000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56186,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665328869,
  "seq" 1720006943,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562436491000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61709,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006950,
  "seq" 1665328869,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562436540000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56187,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329131,
  "seq" 1720006950,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562436593000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56188,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329131,
  "seq" 1720006950,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562436781000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61710,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006962,
  "seq" 1665329131,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562476803000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56189,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329134,
  "seq" 1720006962,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562551778000, "wirelen" 241},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 39392, "source" 53}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562603661000, "wirelen" 436},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 39392, "source" 53}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562937225000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56190,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329134,
  "seq" 1720006962,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562937469000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61711,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006969,
  "seq" 1665329134,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562937530000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56191,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329396,
  "seq" 1720006969,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562939836000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56192,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329396,
  "seq" 1720006969,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562940033000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61712,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006981,
  "seq" 1665329396,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302562979779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56193,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329399,
  "seq" 1720006981,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563438685000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56194,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329399,
  "seq" 1720006981,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563438929000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61713,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720006988,
  "seq" 1665329399,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563438961000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56195,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329661,
  "seq" 1720006988,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563439036000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56196,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329661,
  "seq" 1720006988,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563439219000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61714,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007000,
  "seq" 1665329661,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563478810000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56197,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329664,
  "seq" 1720007000,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563939830000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56198,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329664,
  "seq" 1720007000,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563940072000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61715,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007007,
  "seq" 1665329664,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563940103000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56199,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329926,
  "seq" 1720007007,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563940831000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56200,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329926,
  "seq" 1720007007,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563941017000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61716,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007019,
  "seq" 1665329926,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563961092000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302563980780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56201,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329929,
  "seq" 1720007019,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564440614000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56202,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665329929,
  "seq" 1720007019,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564440854000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61717,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007026,
  "seq" 1665329929,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564440887000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56203,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330191,
  "seq" 1720007026,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564440953000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56204,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330191,
  "seq" 1720007026,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564441133000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61718,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007038,
  "seq" 1665330191,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564480783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56205,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330194,
  "seq" 1720007038,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564743629000, "wirelen" 140},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37984,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846280208,
  "seq" 2619550595,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564770696000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57597,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550669,
  "seq" 846280208,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564770724000, "wirelen" 140},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37985,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846280298,
  "seq" 2619550669,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564800935000, "wirelen" 464},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57598,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846280298,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564801148000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57599,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846280696,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564801286000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37986,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846282144,
  "seq" 2619550743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564801299000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57600,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846282144,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564827326000, "wirelen" 446},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57602,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846285040,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564827352000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37987,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846283592,
  "seq" 2619550743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564827361000, "wirelen" 1514},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57601,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846283592,
  "flags" #{"ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564827375000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37988,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846285420,
  "seq" 2619550743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564941744000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56206,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330194,
  "seq" 1720007038,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564941995000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61719,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007045,
  "seq" 1665330194,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564942023000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56207,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330456,
  "seq" 1720007045,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564942076000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56208,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330456,
  "seq" 1720007045,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564942258000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61720,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007057,
  "seq" 1665330456,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302564981778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56209,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330459,
  "seq" 1720007057,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565442802000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56210,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330459,
  "seq" 1720007057,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565443060000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61721,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007064,
  "seq" 1665330459,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565443096000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56211,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330721,
  "seq" 1720007064,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565443829000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56212,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330721,
  "seq" 1720007064,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565444016000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61722,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007076,
  "seq" 1665330721,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565483792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56213,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330724,
  "seq" 1720007076,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565943515000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56214,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330724,
  "seq" 1720007076,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565943776000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61723,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007083,
  "seq" 1665330724,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565943805000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56215,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330986,
  "seq" 1720007083,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565946422000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56216,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330986,
  "seq" 1720007083,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565946614000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61724,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007095,
  "seq" 1665330986,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565961037000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302565985783000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56217,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330989,
  "seq" 1720007095,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566444278000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56218,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665330989,
  "seq" 1720007095,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566444528000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61725,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007102,
  "seq" 1665330989,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566444580000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56219,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331251,
  "seq" 1720007102,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566446854000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56220,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331251,
  "seq" 1720007102,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566447050000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61726,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007114,
  "seq" 1665331251,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566486778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56221,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331254,
  "seq" 1720007114,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566945521000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56222,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331254,
  "seq" 1720007114,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566945775000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61727,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007121,
  "seq" 1665331254,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566945828000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56223,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331516,
  "seq" 1720007121,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566945884000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56224,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331516,
  "seq" 1720007121,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566946069000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61728,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007133,
  "seq" 1665331516,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302566985791000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56225,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331519,
  "seq" 1720007133,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567446673000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56226,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331519,
  "seq" 1720007133,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567446916000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61729,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007140,
  "seq" 1665331519,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567446969000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56227,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331781,
  "seq" 1720007140,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567452834000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56228,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331781,
  "seq" 1720007140,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567453026000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61730,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007152,
  "seq" 1665331781,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567492825000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56229,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331784,
  "seq" 1720007152,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567947637000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56230,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665331784,
  "seq" 1720007152,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567947890000, "wirelen" 328},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61731,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007159,
  "seq" 1665331784,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567947923000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56231,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332046,
  "seq" 1720007159,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567947987000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56232,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332046,
  "seq" 1720007159,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567948165000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61732,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007171,
  "seq" 1665332046,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567960984000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302567987807000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56233,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332049,
  "seq" 1720007171,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568448814000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56234,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332049,
  "seq" 1720007171,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568449051000, "wirelen" 329},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61733,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007178,
  "seq" 1665332049,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568449082000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56235,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332312,
  "seq" 1720007178,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568451843000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56236,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332312,
  "seq" 1720007178,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568452034000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61734,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007190,
  "seq" 1665332312,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568491789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56237,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332315,
  "seq" 1720007190,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568949660000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56238,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332315,
  "seq" 1720007190,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568949906000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61735,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007197,
  "seq" 1665332315,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568949940000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56239,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332579,
  "seq" 1720007197,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568950003000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56240,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332579,
  "seq" 1720007197,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568950178000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61736,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007209,
  "seq" 1665332579,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302568989789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56241,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332582,
  "seq" 1720007209,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569450832000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56242,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332582,
  "seq" 1720007209,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569451085000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61737,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007216,
  "seq" 1665332582,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569451115000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56243,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332846,
  "seq" 1720007216,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569451882000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56244,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332846,
  "seq" 1720007216,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569452085000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61738,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007228,
  "seq" 1665332846,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569491776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56245,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332849,
  "seq" 1720007228,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569951482000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56246,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665332849,
  "seq" 1720007228,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569951728000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61739,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007235,
  "seq" 1665332849,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569951781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56247,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333113,
  "seq" 1720007235,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569952052000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56248,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333113,
  "seq" 1720007235,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569952229000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61740,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007247,
  "seq" 1665333113,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569960916000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302569991779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56249,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333116,
  "seq" 1720007247,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570452835000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56250,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333116,
  "seq" 1720007247,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570453077000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61741,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007254,
  "seq" 1665333116,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570453107000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56251,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333380,
  "seq" 1720007254,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570454998000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56252,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333380,
  "seq" 1720007254,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570455190000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61742,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007266,
  "seq" 1665333380,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570494792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56253,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333383,
  "seq" 1720007266,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570683427000, "wirelen" 172},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57603,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550743,
  "seq" 846285420,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570683469000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37989,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846285526,
  "seq" 2619550743,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570953875000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56254,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333383,
  "seq" 1720007266,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570954125000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61743,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007273,
  "seq" 1665333383,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570954187000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56255,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333647,
  "seq" 1720007273,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570954250000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56256,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333647,
  "seq" 1720007273,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570954435000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61744,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007285,
  "seq" 1665333647,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302570993795000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56257,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333650,
  "seq" 1720007285,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571346849000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "255.255.255.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571347185000, "wirelen" 165},
 "DataLinkLayer"
 {"index" 0,
  "destination" "FF:FF:FF:FF:FF:FF",
  "source" "90:E6:BA:3C:9A:26",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.255",
  "source" "192.168.20.194",
  "id" 0,
  "tos" 0,
  "ttl" 64,
  "next" 5},
 "Udp" {"index" 2, "destination" 17500, "source" 17500, "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571455027000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56258,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333650,
  "seq" 1720007285,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571455258000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61745,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007292,
  "seq" 1665333650,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571455291000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56259,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333914,
  "seq" 1720007292,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571455350000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56260,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333914,
  "seq" 1720007292,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571455528000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61746,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007304,
  "seq" 1665333914,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571494790000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56261,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333917,
  "seq" 1720007304,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571956200000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56262,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665333917,
  "seq" 1720007304,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571956444000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61747,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007311,
  "seq" 1665333917,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571956491000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56263,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334181,
  "seq" 1720007311,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571956539000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56264,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334181,
  "seq" 1720007311,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571956728000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61748,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007323,
  "seq" 1665334181,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571960878000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302571996777000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56265,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334184,
  "seq" 1720007323,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572080285000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:0E",
  "source" "24:B6:57:08:B2:8C",
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572457342000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56266,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334184,
  "seq" 1720007323,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572457597000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61749,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007330,
  "seq" 1665334184,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572457650000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56267,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334448,
  "seq" 1720007330,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572457704000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56268,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334448,
  "seq" 1720007330,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572457890000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61750,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007342,
  "seq" 1665334448,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572497772000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56269,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334451,
  "seq" 1720007342,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572958553000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56270,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334451,
  "seq" 1720007342,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572958799000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61751,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007349,
  "seq" 1665334451,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572958849000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56271,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334715,
  "seq" 1720007349,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572958896000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56272,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334715,
  "seq" 1720007349,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572959076000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61752,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007361,
  "seq" 1665334715,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302572998781000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56273,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334718,
  "seq" 1720007361,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573459680000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56274,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334718,
  "seq" 1720007361,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573459925000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61753,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007368,
  "seq" 1665334718,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573459977000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56275,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334982,
  "seq" 1720007368,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573460230000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56276,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334982,
  "seq" 1720007368,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573460413000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61754,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007380,
  "seq" 1665334982,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573499814000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56277,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334985,
  "seq" 1720007380,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573886924000, "wirelen" 161},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:00:0C:CC:CC:CC",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573960816000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573960935000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56278,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665334985,
  "seq" 1720007380,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573961180000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61755,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007387,
  "seq" 1665334985,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573961212000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56279,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335249,
  "seq" 1720007387,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573961283000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56280,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335249,
  "seq" 1720007387,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302573961466000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61756,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007399,
  "seq" 1665335249,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574000786000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56281,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335252,
  "seq" 1720007399,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574462071000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56282,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335252,
  "seq" 1720007399,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574462312000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61757,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007406,
  "seq" 1665335252,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574462341000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56283,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335516,
  "seq" 1720007406,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574462825000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56284,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335516,
  "seq" 1720007406,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574463008000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61758,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007418,
  "seq" 1665335516,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574502790000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56285,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335519,
  "seq" 1720007418,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574963490000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56286,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335519,
  "seq" 1720007418,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574963743000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61759,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007425,
  "seq" 1665335519,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574963776000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56287,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335783,
  "seq" 1720007425,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574963840000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56288,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335783,
  "seq" 1720007425,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302574964016000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61760,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007437,
  "seq" 1665335783,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575003814000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56289,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335786,
  "seq" 1720007437,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575051384000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37990,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846285526,
  "seq" 2619550743,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575076827000, "wirelen" 156},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "94.125.182.252",
  "id" 57604,
  "tos" 0,
  "ttl" 49,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 44103,
  "source" 7000,
  "ack" 2619550833,
  "seq" 846285526,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575076929000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "94.125.182.252",
  "source" "192.168.20.126",
  "id" 37991,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 7000,
  "source" 44103,
  "ack" 846285616,
  "seq" 2619550833,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575464669000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56290,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665335786,
  "seq" 1720007437,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575464930000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61761,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007444,
  "seq" 1665335786,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575464961000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56291,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336050,
  "seq" 1720007444,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575465023000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56292,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336050,
  "seq" 1720007444,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575465205000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61762,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007456,
  "seq" 1665336050,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575504779000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56293,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336053,
  "seq" 1720007456,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575960760000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575965294000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56294,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336053,
  "seq" 1720007456,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575965538000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61763,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007463,
  "seq" 1665336053,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575965582000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56295,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336317,
  "seq" 1720007463,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575965636000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56296,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336317,
  "seq" 1720007463,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302575965813000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61764,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007475,
  "seq" 1665336317,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576005782000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56297,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336320,
  "seq" 1720007475,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576466414000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56298,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336320,
  "seq" 1720007475,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576466659000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61765,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007482,
  "seq" 1665336320,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576466716000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56299,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336584,
  "seq" 1720007482,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576466798000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56300,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336584,
  "seq" 1720007482,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576466978000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61766,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007494,
  "seq" 1665336584,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576506784000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56301,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336587,
  "seq" 1720007494,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576967450000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56302,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336587,
  "seq" 1720007494,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576967700000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61767,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007501,
  "seq" 1665336587,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576967733000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56303,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336851,
  "seq" 1720007501,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576968837000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56304,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336851,
  "seq" 1720007501,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302576969024000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61768,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007513,
  "seq" 1665336851,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577008775000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56305,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336854,
  "seq" 1720007513,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577468677000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56306,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665336854,
  "seq" 1720007513,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577468916000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61769,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007520,
  "seq" 1665336854,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577468948000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56307,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337118,
  "seq" 1720007520,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577470848000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56308,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337118,
  "seq" 1720007520,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577471035000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61770,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007532,
  "seq" 1665337118,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577510788000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56309,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337121,
  "seq" 1720007532,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577960714000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577969618000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56310,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337121,
  "seq" 1720007532,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577969857000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61771,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007539,
  "seq" 1665337121,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577969892000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56311,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337385,
  "seq" 1720007539,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577969957000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56312,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337385,
  "seq" 1720007539,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302577970132000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61772,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007551,
  "seq" 1665337385,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578009796000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56313,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337388,
  "seq" 1720007551,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578470786000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56314,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337388,
  "seq" 1720007551,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578471035000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61773,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007558,
  "seq" 1665337388,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578471066000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56315,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337652,
  "seq" 1720007558,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578471126000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56316,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337652,
  "seq" 1720007558,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578471304000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61774,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007570,
  "seq" 1665337652,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578510786000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56317,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337655,
  "seq" 1720007570,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578971848000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56318,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337655,
  "seq" 1720007570,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578972091000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61775,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007577,
  "seq" 1665337655,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578972125000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56319,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337919,
  "seq" 1720007577,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578972825000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56320,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337919,
  "seq" 1720007577,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302578973008000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61776,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007589,
  "seq" 1665337919,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579012787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56321,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337922,
  "seq" 1720007589,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579397936000, "wirelen" 167},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 44921,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 37636,
  "ack" 4031090364,
  "seq" 1939329407,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579409562000, "wirelen" 204},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "213.239.200.187",
  "id" 17944,
  "tos" 32,
  "ttl" 56,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 37636,
  "source" 5222,
  "ack" 1939329508,
  "seq" 4031090364,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579409596000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "213.239.200.187",
  "source" "192.168.20.126",
  "id" 44922,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 5222,
  "source" 37636,
  "ack" 4031090502,
  "seq" 1939329508,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579472597000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56322,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665337922,
  "seq" 1720007589,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579472834000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61777,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007596,
  "seq" 1665337922,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579472864000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56323,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338186,
  "seq" 1720007596,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579472932000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56324,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338186,
  "seq" 1720007596,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579473111000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61778,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007608,
  "seq" 1665338186,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579512791000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56325,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338189,
  "seq" 1720007608,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579960660000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579973594000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56326,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338189,
  "seq" 1720007608,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579973835000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61779,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007615,
  "seq" 1665338189,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579973866000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56327,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338453,
  "seq" 1720007615,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579973931000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56328,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338453,
  "seq" 1720007615,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302579974111000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61780,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007627,
  "seq" 1665338453,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580013778000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56329,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338456,
  "seq" 1720007627,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580474799000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56330,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338456,
  "seq" 1720007627,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580475040000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61781,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007634,
  "seq" 1665338456,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580475070000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56331,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338720,
  "seq" 1720007634,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580475828000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56332,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338720,
  "seq" 1720007634,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580476013000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61782,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007646,
  "seq" 1665338720,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580515792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56333,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338723,
  "seq" 1720007646,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580975381000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56334,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338723,
  "seq" 1720007646,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580975630000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61783,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007653,
  "seq" 1665338723,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580975685000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56335,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338987,
  "seq" 1720007653,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580975741000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56336,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338987,
  "seq" 1720007653,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302580975931000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61784,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007665,
  "seq" 1665338987,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581015787000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56337,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338990,
  "seq" 1720007665,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581372850000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.17.193",
  "source" "192.168.20.126",
  "id" 22937,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 42610,
  "ack" 836471650,
  "seq" 2156868806,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581372879000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "205.188.10.221",
  "source" "192.168.20.126",
  "id" 61311,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53605,
  "ack" 545821032,
  "seq" 1205897403,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581372893000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "64.12.30.49",
  "source" "192.168.20.126",
  "id" 3485,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 443,
  "source" 53237,
  "ack" 459333794,
  "seq" 1609886866,
  "flags" #{"PSH" "ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581476557000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56338,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665338990,
  "seq" 1720007665,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581476806000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61785,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007672,
  "seq" 1665338990,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581476836000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56339,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339254,
  "seq" 1720007672,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581478607000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56340,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339254,
  "seq" 1720007672,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581478799000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61786,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007684,
  "seq" 1665339254,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581482784000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.17.193",
  "id" 24417,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 42610,
  "source" 443,
  "ack" 2156868812,
  "seq" 836471650,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581483773000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "64.12.30.49",
  "id" 36334,
  "tos" 32,
  "ttl" 104,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53237,
  "source" 443,
  "ack" 1609886872,
  "seq" 459333794,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581484068000, "wirelen" 60},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "205.188.10.221",
  "id" 37412,
  "tos" 32,
  "ttl" 103,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 53605,
  "source" 443,
  "ack" 1205897409,
  "seq" 545821032,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581518799000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56341,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339257,
  "seq" 1720007684,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581960607000, "wirelen" 64},
 "DataLinkLayer"
 {"index" 0,
  "destination" "01:80:C2:00:00:00",
  "source" "24:B6:57:08:B2:8C",
  "next" 7}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581977337000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56342,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339257,
  "seq" 1720007684,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581977580000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61787,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007691,
  "seq" 1665339257,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581977637000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56343,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339521,
  "seq" 1720007691,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581977716000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56344,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339521,
  "seq" 1720007691,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302581977895000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61788,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007703,
  "seq" 1665339521,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582017780000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56345,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339524,
  "seq" 1720007703,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582478501000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56346,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339524,
  "seq" 1720007703,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582478757000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61789,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007710,
  "seq" 1665339524,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582478816000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56347,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339788,
  "seq" 1720007710,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582478931000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56348,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339788,
  "seq" 1720007710,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582479113000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61790,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007722,
  "seq" 1665339788,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582518789000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56349,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339791,
  "seq" 1720007722,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582979146000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56350,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665339791,
  "seq" 1720007722,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582979400000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61791,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007729,
  "seq" 1665339791,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582979452000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56351,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340055,
  "seq" 1720007729,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582979509000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56352,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340055,
  "seq" 1720007729,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302582979706000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61792,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007741,
  "seq" 1665340055,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583018792000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56353,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340058,
  "seq" 1720007741,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583480336000, "wirelen" 73},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56354,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340058,
  "seq" 1720007741,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583480585000, "wirelen" 330},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61793,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007748,
  "seq" 1665340058,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583480648000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56355,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340322,
  "seq" 1720007748,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583480718000, "wirelen" 78},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56356,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340322,
  "seq" 1720007748,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583480897000, "wirelen" 69},
 "DataLinkLayer"
 {"index" 0,
  "destination" "90:E6:BA:3C:9A:47",
  "source" "E0:CB:4E:E3:38:46",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.126",
  "source" "192.168.20.1",
  "id" 61794,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 50939,
  "source" 6600,
  "ack" 1720007760,
  "seq" 1665340322,
  "flags" #{"PSH" "ACK"},
  "next" 0}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583520774000, "wirelen" 66},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.168.20.126",
  "id" 56357,
  "tos" 0,
  "ttl" 64,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 6600,
  "source" 50939,
  "ack" 1665340325,
  "seq" 1720007760,
  "flags" #{"ACK"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "138.225.67.0",
  "id" 47116,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756353000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.231.53.0",
  "id" 47117,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756363000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.65.117.0",
  "id" 47118,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756372000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "122.147.249.128",
  "id" 47119,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756381000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "102.238.49.128",
  "id" 47120,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756392000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "159.10.89.0",
  "id" 47121,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756402000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.187.80.128",
  "id" 47122,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756411000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.188.27.0",
  "id" 47123,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756421000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.170.121.0",
  "id" 47124,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756430000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.112.84.0",
  "id" 47125,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756439000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.208.212.0",
  "id" 47126,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.47.108.0",
  "id" 47127,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756458000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.251.65.0",
  "id" 47128,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756467000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.140.255.32",
  "id" 47129,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756476000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.30.24.96",
  "id" 47130,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756486000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.170.235.0",
  "id" 47131,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756497000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.0.234.64",
  "id" 47132,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.250.16.0",
  "id" 47133,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.126.179.64",
  "id" 47134,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.186.164.0",
  "id" 47135,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756537000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.155.208.0",
  "id" 47136,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756547000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.139.153.64",
  "id" 47137,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756556000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.182.254.0",
  "id" 47138,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.223.217.64",
  "id" 47139,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.61.215.64",
  "id" 47140,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756585000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.2.15.0",
  "id" 47141,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.51.112.0",
  "id" 47142,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.139.24.22",
  "id" 47143,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756614000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "221.252.24.0",
  "id" 47144,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756625000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.237.39.128",
  "id" 47145,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.88.63.0",
  "id" 47146,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756644000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.221.90.0",
  "id" 47147,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.212.92.128",
  "id" 47148,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756662000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.153.180.0",
  "id" 47149,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756672000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "35.113.83.128",
  "id" 47150,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756681000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.194.142.0",
  "id" 47151,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756691000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.164.13.128",
  "id" 47152,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756700000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.44.164.0",
  "id" 47153,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756711000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "45.126.169.128",
  "id" 47154,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756720000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.78.135.0",
  "id" 47155,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756729000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "14.156.247.128",
  "id" 47156,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756738000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "181.79.125.0",
  "id" 47157,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.125.243.0",
  "id" 47158,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756762000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "167.152.56.0",
  "id" 47159,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756772000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.220.125.0",
  "id" 47160,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756781000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "53.156.11.128",
  "id" 47161,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756792000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.67.35.128",
  "id" 47162,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756801000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.221.102.192",
  "id" 47163,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.150.28.0",
  "id" 47164,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756820000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.193.214.128",
  "id" 47165,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756829000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.152.11.0",
  "id" 47166,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.49.235.128",
  "id" 47167,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756846000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "175.77.111.0",
  "id" 47168,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.79.9.0",
  "id" 47169,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756864000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "145.17.197.0",
  "id" 47170,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756873000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.139.71.0",
  "id" 47171,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756882000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.81.24.0",
  "id" 47172,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756891000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.69.53.0",
  "id" 47173,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756900000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.22.95.0",
  "id" 47174,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756909000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.77.47.0",
  "id" 47175,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756918000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.50.92.0",
  "id" 47176,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756930000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.110.157.224",
  "id" 47177,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.42.137.128",
  "id" 47178,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756949000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.6.184.0",
  "id" 47179,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756959000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "148.8.82.0",
  "id" 47180,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756968000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.155.220.128",
  "id" 47181,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756977000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.201.70.0",
  "id" 47182,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756986000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.172.96.0",
  "id" 47183,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583756995000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.200.128.0",
  "id" 47184,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757004000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.71.239.128",
  "id" 47185,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757013000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.250.230.128",
  "id" 47186,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757021000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.101.120.0",
  "id" 47187,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757030000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.151.109.0",
  "id" 47188,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757039000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.120.218.0",
  "id" 47189,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757048000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.253.176.0",
  "id" 47190,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757057000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.115.233.128",
  "id" 47191,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757067000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.20.230.0",
  "id" 47192,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757076000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.64.211.224",
  "id" 47193,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757086000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.81.80.64",
  "id" 47194,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.171.0.128",
  "id" 47195,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757103000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.2.170.128",
  "id" 47196,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.233.91.128",
  "id" 47197,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757121000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.220.236.0",
  "id" 47198,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757131000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "67.80.26.0",
  "id" 47199,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757140000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.56.100.0",
  "id" 47200,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.238.177.0",
  "id" 47201,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.219.96.224",
  "id" 47202,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.137.124.0",
  "id" 47203,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.51.230.0",
  "id" 47204,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757186000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "211.241.192.0",
  "id" 47205,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.214.171.0",
  "id" 47206,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757203000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.102.66.0",
  "id" 47207,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757212000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "6.96.93.112",
  "id" 47208,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757224000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.1.53.0",
  "id" 47209,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757233000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.108.250.0",
  "id" 47210,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757242000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.104.176.0",
  "id" 47211,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757251000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.157.17.0",
  "id" 47212,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757260000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.54.64.0",
  "id" 47213,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757270000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.21.15.0",
  "id" 47214,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757278000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.101.146.0",
  "id" 47215,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.126.48.0",
  "id" 47216,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757297000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "181.15.246.0",
  "id" 47217,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757306000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.203.10.0",
  "id" 47218,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757316000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.21.156.160",
  "id" 47219,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757325000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.136.207.192",
  "id" 47220,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757334000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.200.186.0",
  "id" 47221,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757343000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.137.134.0",
  "id" 47222,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757352000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.157.181.0",
  "id" 47223,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757361000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.9.142.0",
  "id" 47224,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757370000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.218.214.128",
  "id" 47225,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757379000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.72.182.24",
  "id" 47226,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757388000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "29.12.56.128",
  "id" 47227,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757397000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.196.50.0",
  "id" 47228,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757406000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.37.163.0",
  "id" 47229,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757417000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.92.82.128",
  "id" 47230,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757426000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.252.150.0",
  "id" 47231,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757435000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "71.20.83.128",
  "id" 47232,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757444000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.55.180.0",
  "id" 47233,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757452000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.134.18.64",
  "id" 47234,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757462000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.72.57.0",
  "id" 47235,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.41.115.0",
  "id" 47236,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757479000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.92.190.0",
  "id" 47237,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "122.174.123.0",
  "id" 47238,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757498000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.137.208.128",
  "id" 47239,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757506000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.93.242.0",
  "id" 47240,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757518000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "211.27.117.0",
  "id" 47241,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "47.242.128.0",
  "id" 47242,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "38.251.3.0",
  "id" 47243,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757545000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.81.180.128",
  "id" 47244,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.7.143.0",
  "id" 47245,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757563000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.96.148.192",
  "id" 47246,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757572000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.207.228.0",
  "id" 47247,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757582000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "148.23.134.0",
  "id" 47248,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757591000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.43.158.0",
  "id" 47249,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757601000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.229.129.0",
  "id" 47250,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757610000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.160.85.0",
  "id" 47251,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757618000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.244.89.0",
  "id" 47252,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757629000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.111.7.0",
  "id" 47253,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.62.10.0",
  "id" 47254,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757647000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.253.231.0",
  "id" 47255,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757655000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.73.221.128",
  "id" 47256,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757664000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.134.193.0",
  "id" 47257,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757673000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "73.10.31.128",
  "id" 47258,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757682000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.14.15.0",
  "id" 47259,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757691000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.172.99.0",
  "id" 47260,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757701000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.102.114.0",
  "id" 47261,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757710000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.10.165.128",
  "id" 47262,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757719000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.192.183.0",
  "id" 47263,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757728000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "68.158.37.128",
  "id" 47264,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757737000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "145.144.184.0",
  "id" 47265,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757757000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.8.239.128",
  "id" 47266,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "179.199.152.0",
  "id" 47267,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757776000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.237.117.128",
  "id" 47268,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757786000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "6.183.106.48",
  "id" 47269,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757794000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "73.81.105.0",
  "id" 47270,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.75.103.128",
  "id" 47271,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757813000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "217.210.223.0",
  "id" 47272,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757825000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.67.233.0",
  "id" 47273,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757834000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.70.106.128",
  "id" 47274,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "107.36.147.128",
  "id" 47275,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757853000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.75.120.128",
  "id" 47276,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757862000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.166.255.0",
  "id" 47277,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757870000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "205.244.120.0",
  "id" 47278,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757879000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.98.253.64",
  "id" 47279,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757888000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.210.158.0",
  "id" 47280,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.217.248.128",
  "id" 47281,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757906000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.3.82.0",
  "id" 47282,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757914000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "39.198.246.64",
  "id" 47283,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757923000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.73.0.0",
  "id" 47284,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757932000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.65.92.0",
  "id" 47285,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757942000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.196.221.0",
  "id" 47286,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757953000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.146.221.0",
  "id" 47287,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757963000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.200.28.192",
  "id" 47288,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.206.253.0",
  "id" 47289,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757981000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "78.160.236.128",
  "id" 47290,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757990000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.116.127.0",
  "id" 47291,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583757999000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "102.53.110.128",
  "id" 47292,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758008000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.171.147.0",
  "id" 47293,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758016000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.53.54.0",
  "id" 47294,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758025000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.211.148.0",
  "id" 47295,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758034000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.60.74.0",
  "id" 47296,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758043000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "168.62.37.0",
  "id" 47297,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758052000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.155.44.0",
  "id" 47298,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758061000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "138.41.192.0",
  "id" 47299,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758070000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.245.144.0",
  "id" 47300,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758080000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.236.149.0",
  "id" 47301,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758089000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.117.40.0",
  "id" 47302,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758098000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "168.200.110.0",
  "id" 47303,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758107000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.48.126.0",
  "id" 47304,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758118000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.187.145.128",
  "id" 47305,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758127000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.237.1.192",
  "id" 47306,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758136000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.123.246.0",
  "id" 47307,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758145000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.98.144.240",
  "id" 47308,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758153000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.225.121.128",
  "id" 47309,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758162000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.222.243.0",
  "id" 47310,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758172000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.53.47.0",
  "id" 47311,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758181000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.187.114.0",
  "id" 47312,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758192000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.226.69.0",
  "id" 47313,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758201000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.252.37.0",
  "id" 47314,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758210000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.4.114.0",
  "id" 47315,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758218000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.35.162.0",
  "id" 47316,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758227000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.193.2.0",
  "id" 47317,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758236000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.151.79.0",
  "id" 47318,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758245000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.235.190.128",
  "id" 47319,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758254000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.143.255.0",
  "id" 47320,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758263000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.56.60.0",
  "id" 47321,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.96.62.0",
  "id" 47322,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758281000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.197.109.0",
  "id" 47323,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758290000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "114.227.206.0",
  "id" 47324,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.149.115.240",
  "id" 47325,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758307000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.153.0.192",
  "id" 47326,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758316000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "211.32.24.0",
  "id" 47327,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758324000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "181.211.153.0",
  "id" 47328,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758333000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.52.45.0",
  "id" 47329,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758342000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.73.216.0",
  "id" 47330,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758350000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.201.41.0",
  "id" 47331,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758359000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.32.194.0",
  "id" 47332,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758368000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.190.255.0",
  "id" 47333,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758377000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "77.145.151.0",
  "id" 47334,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758386000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.81.64.0",
  "id" 47335,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758395000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.122.145.0",
  "id" 47336,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758406000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.126.152.0",
  "id" 47337,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758415000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.205.54.0",
  "id" 47338,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758426000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "217.221.34.0",
  "id" 47339,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758435000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.96.18.0",
  "id" 47340,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758444000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.172.41.0",
  "id" 47341,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758453000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.18.81.0",
  "id" 47342,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758462000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.27.132.128",
  "id" 47343,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758471000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.142.111.0",
  "id" 47344,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758480000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.14.117.128",
  "id" 47345,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758489000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.31.246.64",
  "id" 47346,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758497000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.178.17.0",
  "id" 47347,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758506000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.207.119.0",
  "id" 47348,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758515000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.183.70.0",
  "id" 47349,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758524000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.157.207.0",
  "id" 47350,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758532000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.95.117.128",
  "id" 47351,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758541000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.239.129.128",
  "id" 47352,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758550000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.254.14.0",
  "id" 47353,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758560000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.36.226.0",
  "id" 47354,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758569000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.211.80.0",
  "id" 47355,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758577000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.147.130.0",
  "id" 47356,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758586000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.189.227.0",
  "id" 47357,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "181.243.104.0",
  "id" 47358,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758604000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.103.26.0",
  "id" 47359,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758612000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.242.16.0",
  "id" 47360,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.61.64.0",
  "id" 47361,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758630000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "52.48.67.128",
  "id" 47362,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.18.209.224",
  "id" 47363,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.252.64.0",
  "id" 47364,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758659000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.193.219.0",
  "id" 47365,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758668000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "29.100.17.192",
  "id" 47366,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758677000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.118.208.0",
  "id" 47367,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758685000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "35.64.115.64",
  "id" 47368,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758696000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.49.72.0",
  "id" 47369,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758705000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.83.242.0",
  "id" 47370,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758714000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.160.133.0",
  "id" 47371,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758723000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.221.113.0",
  "id" 47372,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758731000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.102.66.128",
  "id" 47373,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758741000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.188.9.128",
  "id" 47374,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758759000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "27.107.223.192",
  "id" 47375,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.116.184.0",
  "id" 47376,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758776000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.220.0.0",
  "id" 47377,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758785000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.29.241.0",
  "id" 47378,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758794000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.68.47.128",
  "id" 47379,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758802000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.147.69.96",
  "id" 47380,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758811000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.187.192.0",
  "id" 47381,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758820000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.163.164.0",
  "id" 47382,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758829000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.130.198.128",
  "id" 47383,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.185.205.128",
  "id" 47384,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758847000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.200.136.0",
  "id" 47385,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.86.22.0",
  "id" 47386,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758863000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.77.79.128",
  "id" 47387,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758872000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.134.107.0",
  "id" 47388,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758881000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.73.126.64",
  "id" 47389,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758891000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.180.106.72",
  "id" 47390,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758903000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.120.122.128",
  "id" 47391,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758912000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.134.190.0",
  "id" 47392,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.228.174.0",
  "id" 47393,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758930000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "68.139.76.128",
  "id" 47394,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.130.253.0",
  "id" 47395,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758948000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "187.166.136.0",
  "id" 47396,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758956000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.239.94.0",
  "id" 47397,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758970000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.249.205.128",
  "id" 47398,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758979000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.230.251.0",
  "id" 47399,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758988000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.32.166.0",
  "id" 47400,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583758999000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.77.191.0",
  "id" 47401,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759009000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.135.129.0",
  "id" 47402,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759017000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.254.23.16",
  "id" 47403,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759026000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.180.2.0",
  "id" 47404,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759035000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.67.138.64",
  "id" 47405,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759043000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.105.247.0",
  "id" 47406,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759052000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.40.186.0",
  "id" 47407,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759061000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.31.138.0",
  "id" 47408,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759070000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.135.231.0",
  "id" 47409,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759079000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.108.233.0",
  "id" 47410,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.178.208.0",
  "id" 47411,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759097000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "172.67.168.0",
  "id" 47412,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.16.142.128",
  "id" 47413,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759114000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "42.53.150.64",
  "id" 47414,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759123000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.253.117.0",
  "id" 47415,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759131000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "14.217.21.160",
  "id" 47416,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759142000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.139.172.128",
  "id" 47417,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "159.74.197.0",
  "id" 47418,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.95.128.0",
  "id" 47419,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.213.43.0",
  "id" 47420,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759178000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.255.47.0",
  "id" 47421,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.215.251.0",
  "id" 47422,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.91.233.64",
  "id" 47423,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759204000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.227.221.0",
  "id" 47424,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759213000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.99.71.64",
  "id" 47425,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.222.230.0",
  "id" 47426,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759231000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "186.138.102.0",
  "id" 47427,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759240000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.82.165.128",
  "id" 47428,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759249000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.216.180.0",
  "id" 47429,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.113.97.0",
  "id" 47430,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759267000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.115.76.0",
  "id" 47431,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759276000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.38.116.0",
  "id" 47432,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759287000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.248.225.0",
  "id" 47433,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759296000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.113.99.0",
  "id" 47434,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759304000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.218.118.0",
  "id" 47435,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "187.60.108.0",
  "id" 47436,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759322000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.219.89.192",
  "id" 47437,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.3.48.0",
  "id" 47438,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759339000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "100.91.246.0",
  "id" 47439,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759348000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.99.65.64",
  "id" 47440,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759357000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.112.26.0",
  "id" 47441,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759366000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "38.14.197.0",
  "id" 47442,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759377000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.166.233.0",
  "id" 47443,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759386000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.128.167.192",
  "id" 47444,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759395000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.68.91.0",
  "id" 47445,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759404000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "53.164.94.64",
  "id" 47446,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759413000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.89.189.0",
  "id" 47447,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759421000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.208.8.0",
  "id" 47448,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759430000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.239.35.0",
  "id" 47449,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759439000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.185.62.0",
  "id" 47450,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759448000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.165.51.0",
  "id" 47451,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759457000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "153.238.82.0",
  "id" 47452,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759466000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.145.56.0",
  "id" 47453,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759474000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "168.1.28.0",
  "id" 47454,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.210.47.0",
  "id" 47455,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759492000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.244.127.0",
  "id" 47456,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759501000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.224.2.0",
  "id" 47457,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759509000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "115.92.147.128",
  "id" 47458,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759519000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "93.71.37.0",
  "id" 47459,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759528000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.184.182.64",
  "id" 47460,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.205.244.128",
  "id" 47461,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759545000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.186.112.128",
  "id" 47462,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.223.42.0",
  "id" 47463,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759563000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "11.198.213.240",
  "id" 47464,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759574000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.43.212.0",
  "id" 47465,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.185.160.0",
  "id" 47466,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.3.65.0",
  "id" 47467,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759601000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.7.45.128",
  "id" 47468,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759612000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "53.188.208.0",
  "id" 47469,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.95.55.128",
  "id" 47470,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759630000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.106.110.0",
  "id" 47471,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.44.233.88",
  "id" 47472,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.109.252.128",
  "id" 47473,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759657000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.17.87.0",
  "id" 47474,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.173.145.0",
  "id" 47475,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759675000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.178.88.0",
  "id" 47476,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759683000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.181.182.0",
  "id" 47477,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759692000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.7.78.128",
  "id" 47478,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759701000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "167.130.95.0",
  "id" 47479,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759711000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.164.216.0",
  "id" 47480,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759720000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.192.139.128",
  "id" 47481,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759729000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "68.39.145.128",
  "id" 47482,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759737000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.147.42.0",
  "id" 47483,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.81.196.0",
  "id" 47484,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.40.173.96",
  "id" 47485,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.101.88.192",
  "id" 47486,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759964000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.70.68.0",
  "id" 47487,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583759983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.8.175.128",
  "id" 47488,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760002000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "148.193.237.0",
  "id" 47489,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760021000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.141.104.128",
  "id" 47490,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760040000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "112.193.102.0",
  "id" 47491,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760091000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.143.225.36",
  "id" 47492,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.71.217.0",
  "id" 47493,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760130000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.160.144.0",
  "id" 47494,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.86.183.32",
  "id" 47495,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.115.173.64",
  "id" 47496,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760190000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.90.47.128",
  "id" 47497,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760209000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.89.249.0",
  "id" 47498,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760227000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "142.122.218.0",
  "id" 47499,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760246000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.23.0.0",
  "id" 47500,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760264000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.185.48.0",
  "id" 47501,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760283000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "69.229.73.0",
  "id" 47502,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760301000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.67.232.0",
  "id" 47503,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760320000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.39.44.0",
  "id" 47504,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760339000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "201.246.160.0",
  "id" 47505,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760357000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "188.241.122.0",
  "id" 47506,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760376000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.217.132.0",
  "id" 47507,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760394000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.172.86.0",
  "id" 47508,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760412000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "69.248.200.0",
  "id" 47509,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760430000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.91.226.128",
  "id" 47510,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760449000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "114.81.45.128",
  "id" 47511,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760467000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "153.185.84.0",
  "id" 47512,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760485000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.131.116.0",
  "id" 47513,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.228.88.0",
  "id" 47514,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760522000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.11.24.0",
  "id" 47515,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.172.33.0",
  "id" 47516,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760558000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.73.176.96",
  "id" 47517,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760576000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.81.92.0",
  "id" 47518,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760594000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.180.209.0",
  "id" 47519,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760613000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.11.157.0",
  "id" 47520,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760633000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.222.196.32",
  "id" 47521,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760652000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.118.55.0",
  "id" 47522,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760670000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.155.126.0",
  "id" 47523,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760689000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.38.158.0",
  "id" 47524,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "6.22.198.176",
  "id" 47525,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760725000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.242.54.0",
  "id" 47526,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760744000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.154.75.0",
  "id" 47527,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760770000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.112.246.128",
  "id" 47528,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760792000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.76.46.0",
  "id" 47529,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.21.37.0",
  "id" 47530,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760828000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.135.246.0",
  "id" 47531,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760847000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "20.5.93.128",
  "id" 47532,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.250.110.0",
  "id" 47533,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.203.223.0",
  "id" 47534,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.44.138.0",
  "id" 47535,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760920000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.241.14.0",
  "id" 47536,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760938000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.189.88.128",
  "id" 47537,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760972000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.6.12.128",
  "id" 47538,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583760991000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.157.100.0",
  "id" 47539,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761010000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.182.33.0",
  "id" 47540,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761028000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.97.239.0",
  "id" 47541,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761047000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.238.145.192",
  "id" 47542,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761065000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.111.116.128",
  "id" 47543,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761083000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.229.99.0",
  "id" 47544,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761101000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "3.210.233.108",
  "id" 47545,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761119000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.122.140.128",
  "id" 47546,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761140000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "91.145.132.128",
  "id" 47547,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761158000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.28.153.192",
  "id" 47548,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.203.232.0",
  "id" 47549,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.70.86.0",
  "id" 47550,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761213000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.40.55.0",
  "id" 47551,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761232000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.170.172.64",
  "id" 47552,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761251000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "47.188.140.128",
  "id" 47553,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761270000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.195.180.0",
  "id" 47554,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "205.209.74.0",
  "id" 47555,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761306000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "53.211.83.128",
  "id" 47556,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761324000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.181.234.0",
  "id" 47557,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761343000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.107.149.0",
  "id" 47558,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761361000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.68.74.0",
  "id" 47559,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761379000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.2.23.128",
  "id" 47560,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761400000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.128.186.128",
  "id" 47561,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761420000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.204.63.0",
  "id" 47562,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761439000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.7.117.128",
  "id" 47563,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761457000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "78.123.40.128",
  "id" 47564,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761476000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "44.152.30.64",
  "id" 47565,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "81.51.255.0",
  "id" 47566,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761512000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.108.55.64",
  "id" 47567,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761531000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.85.119.0",
  "id" 47568,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "201.58.12.0",
  "id" 47569,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761570000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.9.155.0",
  "id" 47570,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761590000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.11.152.0",
  "id" 47571,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761610000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "187.155.251.0",
  "id" 47572,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761632000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "160.248.45.0",
  "id" 47573,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761650000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.123.13.0",
  "id" 47574,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761669000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.129.94.0",
  "id" 47575,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761687000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.203.23.0",
  "id" 47576,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761706000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.245.153.128",
  "id" 47577,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761725000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.18.226.0",
  "id" 47578,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761744000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.231.177.0",
  "id" 47579,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.193.129.160",
  "id" 47580,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.89.56.0",
  "id" 47581,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761809000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.15.231.0",
  "id" 47582,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.108.45.224",
  "id" 47583,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761864000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.21.196.0",
  "id" 47584,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.211.155.128",
  "id" 47585,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.61.119.224",
  "id" 47586,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761920000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.233.24.0",
  "id" 47587,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761940000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "29.137.133.160",
  "id" 47588,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761958000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.169.13.0",
  "id" 47589,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761977000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.45.97.128",
  "id" 47590,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583761996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.139.157.0",
  "id" 47591,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762015000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.41.199.0",
  "id" 47592,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762036000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "27.249.161.64",
  "id" 47593,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.147.18.70",
  "id" 47594,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762075000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.164.240.0",
  "id" 47595,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762093000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.145.191.128",
  "id" 47596,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.199.17.0",
  "id" 47597,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762130000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.17.39.0",
  "id" 47598,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762152000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.231.54.0",
  "id" 47599,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762171000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.1.28.192",
  "id" 47600,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762190000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.26.194.0",
  "id" 47601,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762209000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.242.207.0",
  "id" 47602,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762227000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.157.23.96",
  "id" 47603,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762247000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.18.239.192",
  "id" 47604,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762267000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.109.219.128",
  "id" 47605,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762285000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.30.117.0",
  "id" 47606,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762304000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "221.222.6.0",
  "id" 47607,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762322000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.99.117.0",
  "id" 47608,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762340000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.49.88.0",
  "id" 47609,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762358000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.197.183.0",
  "id" 47610,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762377000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.36.247.0",
  "id" 47611,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762396000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.138.144.0",
  "id" 47612,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.213.157.0",
  "id" 47613,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762433000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.145.36.128",
  "id" 47614,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762452000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.160.85.0",
  "id" 47615,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.169.57.64",
  "id" 47616,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.206.156.128",
  "id" 47617,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.137.109.0",
  "id" 47618,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.50.191.0",
  "id" 47619,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762543000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.119.169.0",
  "id" 47620,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762561000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.182.206.208",
  "id" 47621,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762579000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.190.92.0",
  "id" 47622,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "168.161.112.0",
  "id" 47623,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762616000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "35.176.112.64",
  "id" 47624,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.81.110.0",
  "id" 47625,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762657000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.70.96.0",
  "id" 47626,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762676000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.66.47.128",
  "id" 47627,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.24.127.0",
  "id" 47628,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762726000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "71.87.135.0",
  "id" 47629,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.41.102.128",
  "id" 47630,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.25.156.0",
  "id" 47631,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.114.74.0",
  "id" 47632,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762808000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.28.53.0",
  "id" 47633,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.182.179.0",
  "id" 47634,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762846000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.133.57.0",
  "id" 47635,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762864000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.138.16.192",
  "id" 47636,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762882000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.213.40.128",
  "id" 47637,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762901000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.99.63.64",
  "id" 47638,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762919000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "73.237.133.128",
  "id" 47639,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762937000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.6.129.0",
  "id" 47640,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762955000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "217.40.246.0",
  "id" 47641,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762974000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.18.124.0",
  "id" 47642,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583762991000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.145.17.0",
  "id" 47643,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763010000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "145.254.147.0",
  "id" 47644,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763029000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.163.161.32",
  "id" 47645,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763047000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.49.101.192",
  "id" 47646,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763065000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.167.204.0",
  "id" 47647,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763084000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.114.61.0",
  "id" 47648,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763102000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "167.186.211.0",
  "id" 47649,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763120000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "52.218.139.128",
  "id" 47650,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763142000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "0.233.230.180",
  "id" 47651,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763161000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "175.113.161.0",
  "id" 47652,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763179000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.152.231.96",
  "id" 47653,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763197000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.139.87.0",
  "id" 47654,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763215000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "211.34.18.0",
  "id" 47655,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763233000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.234.85.136",
  "id" 47656,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763253000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.209.182.192",
  "id" 47657,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.100.66.0",
  "id" 47658,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763290000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.2.212.192",
  "id" 47659,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763309000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.41.61.128",
  "id" 47660,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.141.168.0",
  "id" 47661,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763345000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.28.112.0",
  "id" 47662,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763362000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.155.135.0",
  "id" 47663,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763381000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.169.221.0",
  "id" 47664,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.211.35.128",
  "id" 47665,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763417000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "112.32.192.0",
  "id" 47666,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763435000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.51.238.0",
  "id" 47667,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763453000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "145.168.77.0",
  "id" 47668,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763471000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.131.255.0",
  "id" 47669,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763489000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "15.33.115.208",
  "id" 47670,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.174.205.0",
  "id" 47671,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.172.245.128",
  "id" 47672,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763543000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.51.241.0",
  "id" 47673,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.63.222.0",
  "id" 47674,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763598000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.171.136.128",
  "id" 47675,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763615000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.215.145.0",
  "id" 47676,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763636000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "53.113.67.128",
  "id" 47677,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.83.85.96",
  "id" 47678,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763671000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.73.207.0",
  "id" 47679,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763689000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "221.44.22.0",
  "id" 47680,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.45.225.0",
  "id" 47681,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763725000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.51.181.128",
  "id" 47682,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763742000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "172.157.184.0",
  "id" 47683,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.198.200.128",
  "id" 47684,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763786000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.191.12.128",
  "id" 47685,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "159.191.202.0",
  "id" 47686,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763822000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.177.29.128",
  "id" 47687,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763840000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.144.195.128",
  "id" 47688,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763861000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.36.11.160",
  "id" 47689,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763880000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.179.242.0",
  "id" 47690,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.186.1.0",
  "id" 47691,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763915000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "3.177.179.208",
  "id" 47692,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763933000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.208.98.128",
  "id" 47693,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.85.136.0",
  "id" 47694,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763969000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "160.91.146.0",
  "id" 47695,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583763987000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.163.135.0",
  "id" 47696,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764005000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.118.72.0",
  "id" 47697,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764023000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.143.127.0",
  "id" 47698,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764040000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.75.211.0",
  "id" 47699,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764059000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.250.71.128",
  "id" 47700,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764077000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.176.242.128",
  "id" 47701,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.250.160.0",
  "id" 47702,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764116000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.167.60.176",
  "id" 47703,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764133000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.228.227.64",
  "id" 47704,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764151000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.58.126.0",
  "id" 47705,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.82.197.128",
  "id" 47706,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.188.116.192",
  "id" 47707,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764204000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.171.193.64",
  "id" 47708,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764222000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.166.26.128",
  "id" 47709,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764240000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.6.67.128",
  "id" 47710,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.215.215.192",
  "id" 47711,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764276000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "155.211.251.0",
  "id" 47712,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764295000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.57.249.112",
  "id" 47713,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.117.144.0",
  "id" 47714,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.154.195.128",
  "id" 47715,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764349000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.249.6.0",
  "id" 47716,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764367000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.53.90.0",
  "id" 47717,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764384000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.75.225.0",
  "id" 47718,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764402000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "155.137.202.0",
  "id" 47719,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764435000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.89.102.0",
  "id" 47720,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764456000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.255.212.0",
  "id" 47721,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764474000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.67.203.0",
  "id" 47722,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764491000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.11.26.0",
  "id" 47723,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764509000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.208.55.0",
  "id" 47724,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.153.82.160",
  "id" 47725,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764544000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.102.171.0",
  "id" 47726,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764562000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.115.189.0",
  "id" 47727,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "203.15.155.0",
  "id" 47728,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764600000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "221.246.42.0",
  "id" 47729,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764618000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.191.144.0",
  "id" 47730,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764635000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "84.9.226.128",
  "id" 47731,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "114.167.29.0",
  "id" 47732,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764672000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.186.48.0",
  "id" 47733,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764689000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.177.31.0",
  "id" 47734,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.140.0.0",
  "id" 47735,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764724000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.244.174.0",
  "id" 47736,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764742000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.3.228.0",
  "id" 47737,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764768000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.72.116.0",
  "id" 47738,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764788000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.160.111.128",
  "id" 47739,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764808000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.169.254.224",
  "id" 47740,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.78.184.128",
  "id" 47741,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764846000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.120.70.0",
  "id" 47742,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.125.250.0",
  "id" 47743,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764885000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.136.178.0",
  "id" 47744,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764904000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.237.215.0",
  "id" 47745,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.24.190.0",
  "id" 47746,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.129.184.0",
  "id" 47747,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764957000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.35.49.0",
  "id" 47748,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764975000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.100.159.0",
  "id" 47749,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583764993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "94.11.129.128",
  "id" 47750,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765011000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.124.150.128",
  "id" 47751,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765028000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "187.100.115.0",
  "id" 47752,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "20.79.75.192",
  "id" 47753,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765067000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.135.176.0",
  "id" 47754,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.52.169.0",
  "id" 47755,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765106000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.232.158.128",
  "id" 47756,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765124000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "112.238.91.0",
  "id" 47757,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765141000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.168.102.128",
  "id" 47758,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.248.57.72",
  "id" 47759,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.228.133.0",
  "id" 47760,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765195000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.103.247.0",
  "id" 47761,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765214000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.2.27.128",
  "id" 47762,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765232000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.139.161.116",
  "id" 47763,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765251000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "77.34.38.128",
  "id" 47764,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.179.59.0",
  "id" 47765,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765307000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "173.23.161.0",
  "id" 47766,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765325000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.22.213.0",
  "id" 47767,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765343000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.183.31.0",
  "id" 47768,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765362000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.96.23.0",
  "id" 47769,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765380000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.183.67.192",
  "id" 47770,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765398000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.97.30.0",
  "id" 47771,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765416000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.174.207.0",
  "id" 47772,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765434000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.47.139.0",
  "id" 47773,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765452000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.223.24.128",
  "id" 47774,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.55.129.0",
  "id" 47775,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.29.97.0",
  "id" 47776,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.247.214.32",
  "id" 47777,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.185.57.0",
  "id" 47778,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765544000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.64.146.0",
  "id" 47779,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765563000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "142.92.117.0",
  "id" 47780,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765585000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.196.187.0",
  "id" 47781,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765603000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.189.40.128",
  "id" 47782,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.192.231.128",
  "id" 47783,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.20.6.0",
  "id" 47784,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765659000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.68.216.160",
  "id" 47785,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765677000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "39.245.145.0",
  "id" 47786,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765695000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "205.252.165.0",
  "id" 47787,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765713000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.51.52.0",
  "id" 47788,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765731000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.157.248.0",
  "id" 47789,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765758000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "213.244.222.0",
  "id" 47790,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765777000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.23.184.32",
  "id" 47791,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765795000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.5.238.0",
  "id" 47792,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765814000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "81.246.249.128",
  "id" 47793,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765832000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "17.163.89.160",
  "id" 47794,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765852000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.40.20.180",
  "id" 47795,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765870000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "42.170.52.128",
  "id" 47796,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765889000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.186.252.0",
  "id" 47797,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765907000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.62.234.0",
  "id" 47798,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765925000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.97.84.0",
  "id" 47799,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.27.17.128",
  "id" 47800,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765962000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.246.45.0",
  "id" 47801,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765980000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.194.113.192",
  "id" 47802,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583765999000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.201.224.0",
  "id" 47803,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766018000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.37.184.0",
  "id" 47804,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766037000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.161.138.0",
  "id" 47805,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766054000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.1.97.128",
  "id" 47806,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766075000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.67.25.0",
  "id" 47807,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766094000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.153.96.0",
  "id" 47808,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.186.154.128",
  "id" 47809,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766130000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.131.171.0",
  "id" 47810,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766169000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.245.213.128",
  "id" 47811,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766188000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.127.84.192",
  "id" 47812,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766207000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.64.211.128",
  "id" 47813,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766225000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.182.189.0",
  "id" 47814,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.147.91.0",
  "id" 47815,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766261000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.133.172.0",
  "id" 47816,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766282000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.172.78.0",
  "id" 47817,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766301000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.144.0.0",
  "id" 47818,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766320000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "46.184.223.64",
  "id" 47819,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766338000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.74.69.0",
  "id" 47820,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766356000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.132.222.0",
  "id" 47821,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766375000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.208.151.64",
  "id" 47822,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766394000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.80.51.128",
  "id" 47823,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766412000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.123.215.128",
  "id" 47824,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766431000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.115.241.0",
  "id" 47825,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766449000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.120.72.0",
  "id" 47826,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766467000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.38.12.0",
  "id" 47827,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766485000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "47.46.236.64",
  "id" 47828,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766503000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.183.50.0",
  "id" 47829,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766521000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.135.95.152",
  "id" 47830,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.73.254.0",
  "id" 47831,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766559000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "205.173.94.0",
  "id" 47832,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "55.73.209.64",
  "id" 47833,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766599000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.19.222.0",
  "id" 47834,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766617000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.211.22.0",
  "id" 47835,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766635000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.235.91.0",
  "id" 47836,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "94.21.63.128",
  "id" 47837,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766671000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.22.46.192",
  "id" 47838,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766690000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.132.187.128",
  "id" 47839,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "186.207.218.0",
  "id" 47840,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766727000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.153.218.0",
  "id" 47841,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766752000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.122.145.0",
  "id" 47842,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.79.47.0",
  "id" 47843,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766790000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.218.172.0",
  "id" 47844,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766808000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "80.49.77.128",
  "id" 47845,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766826000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.226.138.0",
  "id" 47846,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766845000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "207.96.88.0",
  "id" 47847,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766863000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.221.155.192",
  "id" 47848,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766884000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.114.138.0",
  "id" 47849,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.25.55.192",
  "id" 47850,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.39.225.0",
  "id" 47851,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.247.103.128",
  "id" 47852,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766958000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.233.207.0",
  "id" 47853,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766976000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.120.20.192",
  "id" 47854,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583766996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.115.63.0",
  "id" 47855,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767031000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "173.93.192.0",
  "id" 47856,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767051000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.240.93.0",
  "id" 47857,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767070000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.153.75.0",
  "id" 47858,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767092000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "220.140.172.0",
  "id" 47859,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767110000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.167.142.128",
  "id" 47860,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767129000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.32.171.0",
  "id" 47861,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767149000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.214.170.0",
  "id" 47862,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.84.237.0",
  "id" 47863,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767186000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "46.106.124.0",
  "id" 47864,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767207000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.234.136.0",
  "id" 47865,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767225000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.40.2.192",
  "id" 47866,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767243000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.85.215.0",
  "id" 47867,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767262000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.255.200.128",
  "id" 47868,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767280000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.62.49.128",
  "id" 47869,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.218.146.128",
  "id" 47870,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767317000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.207.162.192",
  "id" 47871,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767336000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.216.10.192",
  "id" 47872,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767355000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.85.36.0",
  "id" 47873,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767373000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.30.209.192",
  "id" 47874,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767391000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.178.183.0",
  "id" 47875,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.134.112.128",
  "id" 47876,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.1.91.240",
  "id" 47877,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767446000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "93.19.15.128",
  "id" 47878,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767465000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.100.13.0",
  "id" 47879,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.115.230.0",
  "id" 47880,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767504000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.44.70.128",
  "id" 47881,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767523000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.139.238.0",
  "id" 47882,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767542000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.107.77.128",
  "id" 47883,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767560000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.22.22.0",
  "id" 47884,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767582000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.4.3.0",
  "id" 47885,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767600000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.222.140.0",
  "id" 47886,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767619000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.115.214.0",
  "id" 47887,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.244.95.224",
  "id" 47888,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767657000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.119.216.0",
  "id" 47889,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767675000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.0.131.0",
  "id" 47890,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767693000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.155.239.0",
  "id" 47891,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767711000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "147.152.130.0",
  "id" 47892,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767730000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.215.46.0",
  "id" 47893,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767756000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.240.219.0",
  "id" 47894,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767775000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.2.255.0",
  "id" 47895,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767793000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.193.182.128",
  "id" 47896,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767812000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.24.222.64",
  "id" 47897,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767831000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.88.214.0",
  "id" 47898,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767850000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.193.127.0",
  "id" 47899,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767869000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.87.16.0",
  "id" 47900,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767888000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.51.104.64",
  "id" 47901,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767926000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.145.33.176",
  "id" 47902,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767945000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "179.47.26.0",
  "id" 47903,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767964000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.136.139.96",
  "id" 47904,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583767983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "44.175.243.128",
  "id" 47905,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768001000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.225.209.0",
  "id" 47906,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768019000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "68.14.252.0",
  "id" 47907,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.177.79.128",
  "id" 47908,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.244.225.0",
  "id" 47909,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768074000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.115.8.0",
  "id" 47910,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768095000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.37.53.0",
  "id" 47911,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768114000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.33.39.192",
  "id" 47912,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768135000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.254.247.0",
  "id" 47913,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768154000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.144.130.192",
  "id" 47914,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768172000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.55.62.0",
  "id" 47915,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768190000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "207.2.250.0",
  "id" 47916,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768208000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.111.15.0",
  "id" 47917,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768226000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.171.20.0",
  "id" 47918,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.247.89.120",
  "id" 47919,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768263000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.230.232.0",
  "id" 47920,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768281000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.171.152.0",
  "id" 47921,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768300000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "134.147.72.0",
  "id" 47922,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768318000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.127.106.0",
  "id" 47923,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768337000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.130.197.96",
  "id" 47924,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768355000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.132.35.128",
  "id" 47925,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768373000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "19.130.104.192",
  "id" 47926,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768391000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.68.124.0",
  "id" 47927,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.157.1.0",
  "id" 47928,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768429000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.219.63.0",
  "id" 47929,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768447000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.5.250.128",
  "id" 47930,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768466000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "69.244.17.0",
  "id" 47931,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768484000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.14.167.0",
  "id" 47932,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768503000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.151.28.128",
  "id" 47933,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768521000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.35.43.64",
  "id" 47934,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.151.50.80",
  "id" 47935,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768557000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.71.16.0",
  "id" 47936,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768579000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.4.252.128",
  "id" 47937,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.166.46.128",
  "id" 47938,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768616000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.248.95.0",
  "id" 47939,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.249.221.64",
  "id" 47940,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.25.55.128",
  "id" 47941,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768671000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.29.149.0",
  "id" 47942,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768690000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "81.27.5.0",
  "id" 47943,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "107.24.46.0",
  "id" 47944,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768728000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.174.23.0",
  "id" 47945,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768758000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.82.67.0",
  "id" 47946,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768801000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.27.39.128",
  "id" 47947,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768816000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.29.39.0",
  "id" 47948,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768830000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "120.253.87.128",
  "id" 47949,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768844000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.18.129.128",
  "id" 47950,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768857000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.4.14.128",
  "id" 47951,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768871000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.168.239.64",
  "id" 47952,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768885000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "6.165.201.0",
  "id" 47953,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768899000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.131.120.128",
  "id" 47954,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768913000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "71.43.181.0",
  "id" 47955,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768926000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.41.236.0",
  "id" 47956,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768940000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "112.5.225.0",
  "id" 47957,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768954000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.112.49.0",
  "id" 47958,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768968000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "67.198.238.0",
  "id" 47959,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768982000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.225.32.0",
  "id" 47960,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583768996000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.118.43.64",
  "id" 47961,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769010000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.186.254.0",
  "id" 47962,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769027000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.239.199.0",
  "id" 47963,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769041000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.13.71.128",
  "id" 47964,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769056000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.222.42.0",
  "id" 47965,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769069000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "91.134.249.128",
  "id" 47966,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769083000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.84.88.0",
  "id" 47967,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769097000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.227.38.128",
  "id" 47968,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769112000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.45.40.0",
  "id" 47969,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769126000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.76.183.0",
  "id" 47970,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769140000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "52.221.3.192",
  "id" 47971,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769154000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.70.95.0",
  "id" 47972,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.106.75.128",
  "id" 47973,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769183000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.248.9.0",
  "id" 47974,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769197000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.94.141.0",
  "id" 47975,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769211000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.24.98.160",
  "id" 47976,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769228000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.74.76.0",
  "id" 47977,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769243000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.121.180.0",
  "id" 47978,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769257000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.53.138.0",
  "id" 47979,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769270000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.71.164.0",
  "id" 47980,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769284000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.140.53.192",
  "id" 47981,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.57.152.0",
  "id" 47982,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.240.147.0",
  "id" 47983,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769326000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.49.254.128",
  "id" 47984,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769340000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.189.16.0",
  "id" 47985,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769353000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.28.71.192",
  "id" 47986,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769367000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.91.235.0",
  "id" 47987,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769381000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "172.194.242.0",
  "id" 47988,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769396000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "14.140.120.80",
  "id" 47989,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.34.216.192",
  "id" 47990,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769424000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.164.17.0",
  "id" 47991,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769439000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.2.163.128",
  "id" 47992,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769464000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.221.215.0",
  "id" 47993,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769479000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.147.216.0",
  "id" 47994,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.15.235.0",
  "id" 47995,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769507000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.188.1.0",
  "id" 47996,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769522000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.26.209.0",
  "id" 47997,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769537000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.100.66.128",
  "id" 47998,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769551000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "138.159.40.0",
  "id" 47999,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "155.71.249.0",
  "id" 48000,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.176.249.90",
  "id" 48001,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769594000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.124.43.0",
  "id" 48002,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769608000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.142.88.0",
  "id" 48003,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769622000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.27.68.128",
  "id" 48004,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769637000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.116.52.128",
  "id" 48005,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769650000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.236.229.0",
  "id" 48006,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769664000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.51.167.128",
  "id" 48007,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769678000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.190.128.0",
  "id" 48008,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.102.154.0",
  "id" 48009,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.105.48.0",
  "id" 48010,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769722000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.6.36.0",
  "id" 48011,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769736000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.242.207.24",
  "id" 48012,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769756000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "187.162.200.0",
  "id" 48013,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.246.183.0",
  "id" 48014,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769787000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.36.206.0",
  "id" 48015,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769801000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.95.216.128",
  "id" 48016,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769815000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.18.255.0",
  "id" 48017,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769829000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.128.185.0",
  "id" 48018,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769843000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.34.202.0",
  "id" 48019,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769857000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "138.159.119.0",
  "id" 48020,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769871000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.163.145.128",
  "id" 48021,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769885000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.198.219.16",
  "id" 48022,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769899000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.162.27.0",
  "id" 48023,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769913000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "3.129.104.224",
  "id" 48024,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769926000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.90.179.0",
  "id" 48025,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583769940000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.178.5.128",
  "id" 48026,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770051000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.61.106.0",
  "id" 48027,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770069000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.117.132.0",
  "id" 48028,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770083000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.22.72.0",
  "id" 48029,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770097000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "27.220.145.128",
  "id" 48030,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "55.189.124.192",
  "id" 48031,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770125000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.199.65.0",
  "id" 48032,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770140000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.88.189.0",
  "id" 48033,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770154000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.75.212.0",
  "id" 48034,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770168000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.226.134.0",
  "id" 48035,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770182000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.204.241.0",
  "id" 48036,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770196000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.56.185.0",
  "id" 48037,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770227000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.22.45.128",
  "id" 48038,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770241000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "14.139.113.32",
  "id" 48039,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770256000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "142.159.83.0",
  "id" 48040,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770275000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "61.127.94.0",
  "id" 48041,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770289000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "93.145.149.0",
  "id" 48042,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.146.34.0",
  "id" 48043,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770317000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.34.38.128",
  "id" 48044,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "159.136.76.0",
  "id" 48045,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770344000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.182.239.0",
  "id" 48046,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770358000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.129.255.0",
  "id" 48047,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770372000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "59.155.74.0",
  "id" 48048,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770386000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.55.168.92",
  "id" 48049,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770400000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.164.200.224",
  "id" 48050,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.58.193.0",
  "id" 48051,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.219.58.0",
  "id" 48052,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770441000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.107.164.0",
  "id" 48053,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770455000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "145.220.220.0",
  "id" 48054,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.92.163.0",
  "id" 48055,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770483000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.198.87.0",
  "id" 48056,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770497000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "211.142.225.0",
  "id" 48057,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770512000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "175.154.13.0",
  "id" 48058,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770526000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.59.219.0",
  "id" 48059,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.165.41.0",
  "id" 48060,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "203.118.158.0",
  "id" 48061,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770568000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.249.87.128",
  "id" 48062,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770581000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "77.108.106.128",
  "id" 48063,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770596000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.207.91.0",
  "id" 48064,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770610000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "89.69.44.128",
  "id" 48065,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770624000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "73.78.241.0",
  "id" 48066,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770640000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "71.156.76.128",
  "id" 48067,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "55.125.229.64",
  "id" 48068,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770668000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.101.30.0",
  "id" 48069,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770682000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.39.189.128",
  "id" 48070,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770696000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.29.56.0",
  "id" 48071,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770709000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.228.125.0",
  "id" 48072,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770725000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "179.185.82.0",
  "id" 48073,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770739000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.175.89.128",
  "id" 48074,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770760000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.6.163.12",
  "id" 48075,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770774000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "115.65.158.128",
  "id" 48076,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770789000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.102.72.128",
  "id" 48077,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770803000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.136.162.0",
  "id" 48078,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770817000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.220.232.0",
  "id" 48079,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770831000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.157.241.0",
  "id" 48080,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770845000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.45.107.0",
  "id" 48081,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770859000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.23.169.0",
  "id" 48082,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770873000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.121.43.0",
  "id" 48083,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770902000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.153.15.0",
  "id" 48084,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770916000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.244.132.128",
  "id" 48085,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770930000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "220.213.206.0",
  "id" 48086,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770944000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.95.102.0",
  "id" 48087,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770957000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.131.102.0",
  "id" 48088,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770971000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "172.111.218.0",
  "id" 48089,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770985000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "114.155.65.128",
  "id" 48090,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583770999000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.40.143.0",
  "id" 48091,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771012000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.230.121.0",
  "id" 48092,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771029000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.148.153.0",
  "id" 48093,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771043000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "55.148.249.192",
  "id" 48094,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771057000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.181.212.0",
  "id" 48095,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771070000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.217.197.128",
  "id" 48096,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771084000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.227.235.0",
  "id" 48097,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771098000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.82.33.0",
  "id" 48098,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771111000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.87.171.0",
  "id" 48099,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771125000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "44.73.9.64",
  "id" 48100,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771139000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.121.222.128",
  "id" 48101,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771152000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.116.227.0",
  "id" 48102,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771167000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.45.133.192",
  "id" 48103,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771181000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.51.49.0",
  "id" 48104,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771197000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.36.59.224",
  "id" 48105,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771210000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.52.40.192",
  "id" 48106,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771224000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.116.207.0",
  "id" 48107,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771238000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.138.132.0",
  "id" 48108,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771252000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.188.203.0",
  "id" 48109,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771266000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.81.183.128",
  "id" 48110,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771280000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.40.118.0",
  "id" 48111,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771293000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "148.234.54.0",
  "id" 48112,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771307000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.105.96.176",
  "id" 48113,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771322000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.161.160.0",
  "id" 48114,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771335000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.131.69.32",
  "id" 48115,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771349000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "78.93.229.128",
  "id" 48116,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771362000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.119.110.0",
  "id" 48117,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771376000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.226.171.128",
  "id" 48118,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771392000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.225.76.0",
  "id" 48119,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771406000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "102.231.73.0",
  "id" 48120,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771420000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.125.236.0",
  "id" 48121,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771434000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "115.9.219.0",
  "id" 48122,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771449000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.205.193.224",
  "id" 48123,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771462000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "207.18.134.0",
  "id" 48124,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771476000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.158.213.0",
  "id" 48125,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771489000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "157.131.151.0",
  "id" 48126,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771503000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "84.236.74.128",
  "id" 48127,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771517000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.130.191.0",
  "id" 48128,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771531000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "131.213.184.0",
  "id" 48129,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771556000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.67.245.96",
  "id" 48130,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771570000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.203.200.128",
  "id" 48131,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771584000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.79.150.0",
  "id" 48132,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.184.216.0",
  "id" 48133,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771611000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.249.78.0",
  "id" 48134,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771625000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.130.199.0",
  "id" 48135,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771638000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "175.221.20.0",
  "id" 48136,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771654000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.45.118.0",
  "id" 48137,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771668000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "115.247.149.128",
  "id" 48138,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771681000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.103.152.128",
  "id" 48139,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771695000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "14.234.65.224",
  "id" 48140,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771709000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.73.77.0",
  "id" 48141,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771722000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.144.13.128",
  "id" 48142,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771736000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.212.120.0",
  "id" 48143,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771756000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "205.178.174.0",
  "id" 48144,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771771000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.49.174.32",
  "id" 48145,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771785000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.87.189.0",
  "id" 48146,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771799000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.16.147.64",
  "id" 48147,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771813000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.169.28.0",
  "id" 48148,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.58.104.0",
  "id" 48149,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771841000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.241.222.0",
  "id" 48150,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.144.101.0",
  "id" 48151,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771869000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.184.84.64",
  "id" 48152,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.251.185.0",
  "id" 48153,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.94.39.0",
  "id" 48154,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771911000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.202.217.128",
  "id" 48155,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771925000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "34.154.141.64",
  "id" 48156,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.225.189.80",
  "id" 48157,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771952000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "89.183.36.128",
  "id" 48158,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771966000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.29.76.128",
  "id" 48159,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771980000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.183.117.0",
  "id" 48160,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583771994000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "107.251.25.128",
  "id" 48161,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772008000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.233.20.240",
  "id" 48162,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772022000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.7.10.0",
  "id" 48163,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772036000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.179.241.128",
  "id" 48164,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.226.99.0",
  "id" 48165,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772063000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.137.208.128",
  "id" 48166,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.145.6.0",
  "id" 48167,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772092000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.15.218.0",
  "id" 48168,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772107000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.129.103.0",
  "id" 48169,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772122000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.248.157.128",
  "id" 48170,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772138000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.250.28.0",
  "id" 48171,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772152000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.202.180.0",
  "id" 48172,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772166000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.136.171.0",
  "id" 48173,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772179000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.206.147.192",
  "id" 48174,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772205000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "162.125.97.0",
  "id" 48175,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772219000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.186.89.0",
  "id" 48176,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772233000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.38.80.176",
  "id" 48177,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772247000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "222.141.245.0",
  "id" 48178,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772261000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.99.117.128",
  "id" 48179,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772275000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.96.184.128",
  "id" 48180,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772289000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.127.212.0",
  "id" 48181,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.243.219.0",
  "id" 48182,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772317000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.25.13.0",
  "id" 48183,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "59.123.140.192",
  "id" 48184,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772344000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "196.82.2.0",
  "id" 48185,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772358000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.227.230.128",
  "id" 48186,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "94.22.26.128",
  "id" 48187,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772385000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.51.191.0",
  "id" 48188,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.155.10.0",
  "id" 48189,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772413000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.51.103.0",
  "id" 48190,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772427000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "115.235.51.128",
  "id" 48191,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772441000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.150.36.128",
  "id" 48192,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772455000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.28.123.0",
  "id" 48193,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772468000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "221.242.62.0",
  "id" 48194,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772482000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.74.21.128",
  "id" 48195,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772496000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.254.222.0",
  "id" 48196,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772511000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.124.15.0",
  "id" 48197,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.219.27.0",
  "id" 48198,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772539000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "220.14.185.0",
  "id" 48199,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772553000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.253.117.0",
  "id" 48200,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772569000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.211.185.0",
  "id" 48201,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772583000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "98.8.212.128",
  "id" 48202,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772597000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "27.200.41.32",
  "id" 48203,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772612000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.92.100.0",
  "id" 48204,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772625000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "139.215.104.0",
  "id" 48205,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "190.69.138.0",
  "id" 48206,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.22.190.0",
  "id" 48207,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.253.185.0",
  "id" 48208,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772680000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "188.211.128.0",
  "id" 48209,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.122.51.128",
  "id" 48210,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "217.94.114.0",
  "id" 48211,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772722000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "160.83.83.0",
  "id" 48212,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772736000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.110.14.0",
  "id" 48213,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772755000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.119.126.128",
  "id" 48214,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772770000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "219.206.224.0",
  "id" 48215,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772784000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.192.16.0",
  "id" 48216,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772798000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "170.91.101.0",
  "id" 48217,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772812000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "89.228.250.0",
  "id" 48218,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772825000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.243.207.0",
  "id" 48219,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772839000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.246.111.128",
  "id" 48220,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.24.97.0",
  "id" 48221,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772879000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.223.2.192",
  "id" 48222,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772895000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.140.148.0",
  "id" 48223,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772909000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.52.220.64",
  "id" 48224,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772923000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.209.64.128",
  "id" 48225,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772936000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.214.169.128",
  "id" 48226,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.51.187.0",
  "id" 48227,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772965000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "111.77.79.128",
  "id" 48228,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772979000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.177.196.0",
  "id" 48229,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583772993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.66.116.0",
  "id" 48230,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773007000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.74.197.0",
  "id" 48231,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773020000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.133.125.128",
  "id" 48232,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773036000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "59.75.72.128",
  "id" 48233,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773050000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.18.238.0",
  "id" 48234,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773064000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "126.225.226.0",
  "id" 48235,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773078000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.34.176.0",
  "id" 48236,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773091000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.88.120.0",
  "id" 48237,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773105000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "102.248.159.128",
  "id" 48238,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773119000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.32.106.0",
  "id" 48239,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773132000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.43.249.0",
  "id" 48240,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773146000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.114.211.0",
  "id" 48241,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773160000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.126.219.0",
  "id" 48242,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773173000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "77.127.75.128",
  "id" 48243,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.224.225.0",
  "id" 48244,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773201000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.246.90.0",
  "id" 48245,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773214000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "73.78.44.0",
  "id" 48246,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773228000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.160.241.0",
  "id" 48247,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773242000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "147.81.191.0",
  "id" 48248,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773257000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.51.38.0",
  "id" 48249,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.148.192.0",
  "id" 48250,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773286000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.72.46.192",
  "id" 48251,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773301000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.75.134.160",
  "id" 48252,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773316000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.115.195.0",
  "id" 48253,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773330000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "17.212.194.128",
  "id" 48254,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773345000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.128.99.0",
  "id" 48255,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773360000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.69.3.112",
  "id" 48256,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773374000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.171.108.0",
  "id" 48257,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773388000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "30.180.30.64",
  "id" 48258,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773402000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.146.83.0",
  "id" 48259,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773416000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.93.48.176",
  "id" 48260,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773430000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.246.146.0",
  "id" 48261,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773444000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.221.23.128",
  "id" 48262,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773458000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.226.174.128",
  "id" 48263,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773472000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.65.218.192",
  "id" 48264,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773488000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "62.240.5.128",
  "id" 48265,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773512000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.196.144.0",
  "id" 48266,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773526000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "26.100.139.128",
  "id" 48267,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773540000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "15.72.125.224",
  "id" 48268,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773554000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.189.47.128",
  "id" 48269,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773567000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.132.246.0",
  "id" 48270,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773581000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.116.118.0",
  "id" 48271,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.48.2.64",
  "id" 48272,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773608000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "52.3.208.128",
  "id" 48273,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773622000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.243.193.208",
  "id" 48274,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.16.228.0",
  "id" 48275,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773652000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "28.250.42.128",
  "id" 48276,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.65.237.0",
  "id" 48277,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773680000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.177.212.0",
  "id" 48278,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.75.234.0",
  "id" 48279,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773707000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.117.19.32",
  "id" 48280,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773721000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "153.70.148.0",
  "id" 48281,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773735000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.148.24.20",
  "id" 48282,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773754000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.192.153.192",
  "id" 48283,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773769000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.186.87.0",
  "id" 48284,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773783000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "20.104.218.128",
  "id" 48285,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773797000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.64.252.128",
  "id" 48286,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.255.91.0",
  "id" 48287,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773824000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "104.20.71.0",
  "id" 48288,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773837000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.245.27.0",
  "id" 48289,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773851000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "39.145.173.192",
  "id" 48290,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.113.119.0",
  "id" 48291,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773880000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.235.173.0",
  "id" 48292,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773894000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.110.197.0",
  "id" 48293,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773908000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.84.38.0",
  "id" 48294,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773922000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.45.136.0",
  "id" 48295,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773936000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "179.94.202.0",
  "id" 48296,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.24.181.0",
  "id" 48297,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773966000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.146.20.0",
  "id" 48298,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773980000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.167.72.0",
  "id" 48299,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583773994000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.213.228.128",
  "id" 48300,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774010000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.23.9.0",
  "id" 48301,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774024000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.27.190.0",
  "id" 48302,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774038000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "61.5.230.192",
  "id" 48303,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774052000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.26.217.0",
  "id" 48304,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774066000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.15.128.0",
  "id" 48305,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774079000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.22.202.0",
  "id" 48306,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774093000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.21.4.0",
  "id" 48307,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774107000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "220.81.109.0",
  "id" 48308,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774121000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "173.200.159.0",
  "id" 48309,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774135000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.96.237.0",
  "id" 48310,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774149000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.198.128.192",
  "id" 48311,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774175000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.15.51.0",
  "id" 48312,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774189000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.245.5.0",
  "id" 48313,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774203000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "50.135.26.128",
  "id" 48314,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774217000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.201.138.64",
  "id" 48315,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774230000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.93.223.0",
  "id" 48316,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "147.200.23.0",
  "id" 48317,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.200.229.0",
  "id" 48318,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.114.38.0",
  "id" 48319,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774285000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.189.50.128",
  "id" 48320,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "201.90.147.0",
  "id" 48321,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.227.157.0",
  "id" 48322,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.168.224.0",
  "id" 48323,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774342000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "93.201.88.0",
  "id" 48324,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774356000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "147.55.195.0",
  "id" 48325,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774369000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "118.214.103.0",
  "id" 48326,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774385000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.40.34.64",
  "id" 48327,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774399000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.80.120.128",
  "id" 48328,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774415000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.104.123.0",
  "id" 48329,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774429000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "19.207.106.128",
  "id" 48330,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774443000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.38.93.0",
  "id" 48331,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774457000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "220.127.132.0",
  "id" 48332,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.235.41.0",
  "id" 48333,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774485000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.44.68.0",
  "id" 48334,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774499000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.154.92.0",
  "id" 48335,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774513000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "59.250.169.0",
  "id" 48336,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774527000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.67.14.0",
  "id" 48337,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774541000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "161.175.96.0",
  "id" 48338,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774555000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.76.22.192",
  "id" 48339,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774568000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "128.11.172.0",
  "id" 48340,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774582000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.16.77.128",
  "id" 48341,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774596000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.18.151.128",
  "id" 48342,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774610000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "7.26.222.176",
  "id" 48343,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774624000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "39.5.82.192",
  "id" 48344,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774637000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.153.178.128",
  "id" 48345,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774652000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "23.228.104.224",
  "id" 48346,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.99.50.0",
  "id" 48347,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774680000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.97.201.128",
  "id" 48348,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "185.173.78.0",
  "id" 48349,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774708000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.213.88.128",
  "id" 48350,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774722000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.30.252.0",
  "id" 48351,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774736000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "163.7.225.0",
  "id" 48352,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774757000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "17.184.246.64",
  "id" 48353,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774772000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.199.219.192",
  "id" 48354,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774787000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.209.56.192",
  "id" 48355,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774801000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.240.186.0",
  "id" 48356,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774826000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "167.158.67.0",
  "id" 48357,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774840000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "81.249.91.0",
  "id" 48358,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774853000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.65.49.64",
  "id" 48359,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774867000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.6.190.128",
  "id" 48360,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774882000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "101.200.197.128",
  "id" 48361,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774896000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.103.142.0",
  "id" 48362,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774911000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.134.66.64",
  "id" 48363,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774925000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.179.238.64",
  "id" 48364,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.147.210.0",
  "id" 48365,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774952000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "209.32.159.0",
  "id" 48366,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774966000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "84.174.151.128",
  "id" 48367,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774980000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.214.223.0",
  "id" 48368,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583774993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.208.0.0",
  "id" 48369,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775007000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.250.174.0",
  "id" 48370,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775021000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "9.226.138.240",
  "id" 48371,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775035000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.224.77.64",
  "id" 48372,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.13.70.0",
  "id" 48373,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775063000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "16.253.105.160",
  "id" 48374,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775077000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.229.160.0",
  "id" 48375,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775091000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.166.247.128",
  "id" 48376,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775105000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.225.210.192",
  "id" 48377,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775119000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.72.210.128",
  "id" 48378,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775135000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "167.8.193.0",
  "id" 48379,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775149000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.143.32.180",
  "id" 48380,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775163000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "124.30.43.0",
  "id" 48381,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775177000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "44.39.189.0",
  "id" 48382,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775191000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.151.1.0",
  "id" 48383,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775204000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.215.33.0",
  "id" 48384,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775218000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.239.152.128",
  "id" 48385,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775232000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.104.59.0",
  "id" 48386,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775246000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.199.218.128",
  "id" 48387,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775260000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.141.220.0",
  "id" 48388,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775274000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.97.149.64",
  "id" 48389,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775288000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.9.12.0",
  "id" 48390,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775302000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.148.154.128",
  "id" 48391,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775316000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.42.91.0",
  "id" 48392,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.112.154.0",
  "id" 48393,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775345000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "105.26.220.128",
  "id" 48394,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775360000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "182.222.73.0",
  "id" 48395,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775373000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "4.4.107.80",
  "id" 48396,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775387000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "90.59.124.0",
  "id" 48397,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775400000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.140.224.64",
  "id" 48398,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775415000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.219.74.128",
  "id" 48399,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.11.123.80",
  "id" 48400,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775442000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "184.135.142.0",
  "id" 48401,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775456000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.189.213.128",
  "id" 48402,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775481000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "34.235.200.128",
  "id" 48403,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775495000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "176.148.212.0",
  "id" 48404,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775511000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.187.63.0",
  "id" 48405,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775525000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "95.209.104.128",
  "id" 48406,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775538000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.59.203.0",
  "id" 48407,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775552000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.157.17.0",
  "id" 48408,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "156.26.59.0",
  "id" 48409,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775580000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "13.68.140.80",
  "id" 48410,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775593000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "180.44.50.0",
  "id" 48411,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775607000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.56.102.128",
  "id" 48412,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775621000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "57.108.73.0",
  "id" 48413,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.195.51.128",
  "id" 48414,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775648000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "198.15.136.0",
  "id" 48415,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775662000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.91.226.0",
  "id" 48416,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775676000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.43.110.0",
  "id" 48417,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775691000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "56.215.98.128",
  "id" 48418,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775705000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "186.233.190.0",
  "id" 48419,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775718000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.141.4.0",
  "id" 48420,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775732000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "179.224.110.0",
  "id" 48421,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775751000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "35.126.88.64",
  "id" 48422,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775765000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "86.183.94.0",
  "id" 48423,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775778000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.81.8.0",
  "id" 48424,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775796000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.153.53.0",
  "id" 48425,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775810000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "45.149.167.0",
  "id" 48426,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775825000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "36.85.115.64",
  "id" 48427,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "6.212.176.96",
  "id" 48428,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775852000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "89.34.135.128",
  "id" 48429,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775865000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.48.190.0",
  "id" 48430,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775881000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "19.224.43.192",
  "id" 48431,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775896000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.170.21.192",
  "id" 48432,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775909000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "41.238.147.0",
  "id" 48433,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775924000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "54.203.244.128",
  "id" 48434,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775938000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.62.233.112",
  "id" 48435,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775951000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.169.210.0",
  "id" 48436,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775965000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.157.93.0",
  "id" 48437,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775979000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "72.122.181.0",
  "id" 48438,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583775993000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.70.228.0",
  "id" 48439,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776007000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.183.152.0",
  "id" 48440,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776020000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "85.191.65.0",
  "id" 48441,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776034000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "88.115.22.0",
  "id" 48442,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776049000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "138.239.255.0",
  "id" 48443,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776063000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.43.138.0",
  "id" 48444,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776077000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.54.74.0",
  "id" 48445,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776091000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "112.255.134.0",
  "id" 48446,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776105000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "69.135.108.0",
  "id" 48447,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776132000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "82.97.184.0",
  "id" 48448,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776147000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.214.233.0",
  "id" 48449,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776161000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "32.113.41.192",
  "id" 48450,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776174000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "10.238.187.128",
  "id" 48451,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776188000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "125.183.87.0",
  "id" 48452,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776202000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "67.239.130.0",
  "id" 48453,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776216000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "97.166.26.0",
  "id" 48454,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776230000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.8.95.0",
  "id" 48455,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.136.183.0",
  "id" 48456,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776261000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "143.59.193.0",
  "id" 48457,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776276000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "194.93.210.0",
  "id" 48458,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776289000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "215.93.103.0",
  "id" 48459,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776303000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.94.72.16",
  "id" 48460,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776317000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.142.144.0",
  "id" 48461,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776331000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "11.61.146.192",
  "id" 48462,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776344000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.8.93.128",
  "id" 48463,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776358000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.125.34.0",
  "id" 48464,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776372000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "66.9.135.0",
  "id" 48465,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776386000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.71.71.0",
  "id" 48466,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776400000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "113.38.245.0",
  "id" 48467,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "216.166.228.0",
  "id" 48468,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "132.193.252.0",
  "id" 48469,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776441000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.109.216.128",
  "id" 48470,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776456000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "75.94.124.0",
  "id" 48471,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776470000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "218.129.61.0",
  "id" 48472,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776484000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.224.239.0",
  "id" 48473,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776497000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.78.123.0",
  "id" 48474,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776511000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.172.199.0",
  "id" 48475,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776524000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.23.56.128",
  "id" 48476,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776539000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "103.78.1.0",
  "id" 48477,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776552000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "207.52.51.0",
  "id" 48478,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776566000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "178.120.240.0",
  "id" 48479,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776581000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.36.233.192",
  "id" 48480,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776595000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "15.165.93.32",
  "id" 48481,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776608000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "189.103.172.0",
  "id" 48482,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776625000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.220.64.0",
  "id" 48483,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776639000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.148.223.0",
  "id" 48484,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776653000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "63.13.197.128",
  "id" 48485,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776666000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.228.160.0",
  "id" 48486,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776680000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "68.29.149.128",
  "id" 48487,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776694000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.73.134.0",
  "id" 48488,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776710000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.66.114.0",
  "id" 48489,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776724000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "59.122.252.128",
  "id" 48490,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776739000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.167.206.0",
  "id" 48491,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776758000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.209.2.0",
  "id" 48492,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776772000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.184.143.128",
  "id" 48493,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776799000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.176.44.0",
  "id" 48494,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776813000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.78.37.0",
  "id" 48495,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776827000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.194.22.0",
  "id" 48496,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776841000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "108.247.115.0",
  "id" 48497,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776855000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "19.117.25.224",
  "id" 48498,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776869000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.104.250.0",
  "id" 48499,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776883000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "17.185.111.0",
  "id" 48500,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776897000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "40.226.242.128",
  "id" 48501,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776911000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "204.199.118.0",
  "id" 48502,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776925000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.58.171.240",
  "id" 48503,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776939000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.195.225.0",
  "id" 48504,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776953000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "195.21.241.0",
  "id" 48505,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776968000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "149.231.115.0",
  "id" 48506,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776983000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.219.25.128",
  "id" 48507,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583776998000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.99.242.0",
  "id" 48508,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777015000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "133.27.167.0",
  "id" 48509,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777030000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "201.84.10.0",
  "id" 48510,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777045000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "123.136.220.0",
  "id" 48511,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777060000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "148.193.4.0",
  "id" 48512,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777074000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "166.187.182.0",
  "id" 48513,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777088000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "74.101.28.128",
  "id" 48514,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777101000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "8.85.226.128",
  "id" 48515,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777115000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.201.123.56",
  "id" 48516,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777129000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "183.73.188.0",
  "id" 48517,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777143000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.115.120.0",
  "id" 48518,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777157000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.19.1.0",
  "id" 48519,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777171000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "38.140.46.128",
  "id" 48520,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "135.238.117.0",
  "id" 48521,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777202000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "202.186.207.0",
  "id" 48522,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777216000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "10.93.48.112",
  "id" 48523,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777230000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "206.167.4.0",
  "id" 48524,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777244000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "27.106.251.128",
  "id" 48525,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777258000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "140.171.85.0",
  "id" 48526,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777272000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.105.26.0",
  "id" 48527,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777286000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "136.98.110.0",
  "id" 48528,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777300000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "160.32.111.0",
  "id" 48529,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777314000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.210.20.160",
  "id" 48530,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777328000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.27.222.0",
  "id" 48531,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777342000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "201.3.98.0",
  "id" 48532,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777356000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "5.153.139.0",
  "id" 48533,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777371000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "166.86.138.0",
  "id" 48534,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777387000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.199.66.128",
  "id" 48535,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777401000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "200.175.124.0",
  "id" 48536,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777414000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.61.253.0",
  "id" 48537,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777428000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.162.92.0",
  "id" 48538,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777453000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "51.19.110.0",
  "id" 48539,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777467000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "1.89.163.4",
  "id" 48540,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777481000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "127.246.101.128",
  "id" 48541,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777495000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "174.156.74.0",
  "id" 48542,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777509000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "150.26.166.0",
  "id" 48543,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777523000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.178.27.128",
  "id" 48544,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777537000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "25.1.102.96",
  "id" 48545,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777550000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.112.137.0",
  "id" 48546,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777564000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.123.151.0",
  "id" 48547,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777578000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "208.75.35.0",
  "id" 48548,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777592000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "10.228.1.0",
  "id" 48549,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777606000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "64.142.152.128",
  "id" 48550,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "22.215.81.64",
  "id" 48551,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "146.210.118.0",
  "id" 48552,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777650000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.73.103.192",
  "id" 48553,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777664000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.52.129.192",
  "id" 48554,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777678000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "129.121.122.0",
  "id" 48555,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777692000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.180.99.128",
  "id" 48556,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777706000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "173.223.215.0",
  "id" 48557,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777720000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "24.226.147.192",
  "id" 48558,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777734000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "207.22.209.0",
  "id" 48559,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777753000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "110.0.70.0",
  "id" 48560,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777770000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "49.180.168.64",
  "id" 48561,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777784000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "137.50.175.0",
  "id" 48562,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777797000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "87.3.168.0",
  "id" 48563,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777811000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "55.78.51.128",
  "id" 48564,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777825000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "79.137.57.0",
  "id" 48565,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777838000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "214.202.235.0",
  "id" 48566,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777852000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.253.175.128",
  "id" 48567,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777866000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.199.54.0",
  "id" 48568,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777879000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "141.109.70.0",
  "id" 48569,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777893000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "83.17.29.128",
  "id" 48570,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777907000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "173.32.216.0",
  "id" 48571,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777921000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "45.99.172.128",
  "id" 48572,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777935000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.173.103.64",
  "id" 48573,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777949000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.59.127.0",
  "id" 48574,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777963000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "116.21.200.0",
  "id" 48575,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777977000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "58.174.205.128",
  "id" 48576,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583777990000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.172.8.0",
  "id" 48577,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778004000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "192.145.95.0",
  "id" 48578,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778018000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "42.249.240.128",
  "id" 48579,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778032000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "44.144.9.0",
  "id" 48580,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778046000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "33.31.246.192",
  "id" 48581,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778060000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "65.209.65.128",
  "id" 48582,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778073000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "191.98.126.0",
  "id" 48583,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778087000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "76.105.95.0",
  "id" 48584,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778115000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "99.5.195.128",
  "id" 48585,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778129000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "96.219.248.0",
  "id" 48586,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778145000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "147.29.194.0",
  "id" 48587,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778159000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "48.229.154.128",
  "id" 48588,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778173000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "121.190.140.0",
  "id" 48589,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778187000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "130.52.148.0",
  "id" 48590,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778201000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "158.229.225.0",
  "id" 48591,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778215000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "171.115.52.0",
  "id" 48592,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778229000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "43.103.66.192",
  "id" 48593,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778242000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "21.233.136.192",
  "id" 48594,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778256000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "2.193.103.172",
  "id" 48595,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778270000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "122.240.123.128",
  "id" 48596,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778285000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.180.115.32",
  "id" 48597,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778299000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "34.191.23.0",
  "id" 48598,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778313000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "70.183.177.0",
  "id" 48599,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778327000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "154.33.186.0",
  "id" 48600,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778340000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "117.208.52.0",
  "id" 48601,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778354000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "19.216.137.128",
  "id" 48602,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778368000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.133.102.0",
  "id" 48603,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778382000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "151.125.156.0",
  "id" 48604,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778396000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "119.20.8.128",
  "id" 48605,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778410000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "91.155.46.0",
  "id" 48606,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778424000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "210.44.106.0",
  "id" 48607,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778438000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "152.192.16.0",
  "id" 48608,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778451000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "60.44.140.128",
  "id" 48609,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778465000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "29.38.89.224",
  "id" 48610,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778479000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "197.80.25.0",
  "id" 48611,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778493000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "93.76.131.128",
  "id" 48612,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778508000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "94.247.156.0",
  "id" 48613,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778522000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "164.178.152.0",
  "id" 48614,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778536000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "169.181.226.0",
  "id" 48615,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778549000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "193.253.95.0",
  "id" 48616,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778565000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "37.142.144.0",
  "id" 48617,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778579000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "92.211.164.0",
  "id" 48618,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778593000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "18.226.249.192",
  "id" 48619,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778606000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "159.77.28.0",
  "id" 48620,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778620000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "223.8.56.0",
  "id" 48621,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778634000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "177.200.219.0",
  "id" 48622,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778647000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "106.192.80.0",
  "id" 48623,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778661000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "42.111.122.64",
  "id" 48624,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778676000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "199.178.99.0",
  "id" 48625,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778689000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "109.129.184.0",
  "id" 48626,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778703000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "165.95.246.0",
  "id" 48627,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778717000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "212.102.214.0",
  "id" 48628,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778731000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "144.64.207.0",
  "id" 48629,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778774000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "12.23.167.48",
  "id" 48630,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778789000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "142.136.144.0",
  "id" 48631,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778804000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "38.17.3.128",
  "id" 48632,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778818000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "source" "31.240.48.128",
  "id" 48633,
  "tos" 0,
  "ttl" 255,
  "next" 4},
 "Tcp"
 {"index" 2,
  "destination" 80,
  "source" 0,
  "ack" 42,
  "seq" 42,
  "flags" #{"SYN"}}}}


{"sniffer.header.parsed" {"PcapHeader" {"timestampInNanos" 1352302583778832000, "wirelen" 74},
 "DataLinkLayer"
 {"index" 0,
  "destination" "E0:CB:4E:E3:38:46",
  "source" "90:E6:BA:3C:9A:47",
  "next" 2},
 "NetworkLayer"
 {"index" 1,
  "destination" "192.168.20.1",
  "id" 48634,
 "Tcp"
