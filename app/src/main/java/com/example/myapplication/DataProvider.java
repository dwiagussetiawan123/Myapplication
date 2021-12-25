package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.myapplication.model.System;

public class DataProvider {
    private static List<System> systems = new ArrayList<>();


    static void initDataSystem(Context ctx) {
        systems.add(new System("Microsoft Windows", "Windows 11","Microsoft Windows, commonly referred to as Windows, is a group of several proprietary graphical operating system families, all of which are developed and marketed by Microsoft. Each family caters to a certain sector of the computing industry. Active Microsoft Windows families include Windows NT and Windows IoT; these may encompass subfamilies, (e.g. Windows Server or Windows Embedded Compact) (Windows CE). Defunct Microsoft Windows families include Windows 9x, Windows Mobile and Windows Phone.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e2/Windows_logo_and_wordmark_-_2021.svg/800px-Windows_logo_and_wordmark_-_2021.svg.png","Microsoft","https://www.microsoft.com/en-id/windows/?r=1","Propietary", R.drawable.windows_logo));
        systems.add(new System("MacOS", "macOS 12 Monterey",
                "macOS (/ˌmækoʊˈɛs/;[8] previously Mac OS X and later OS X) is a proprietary graphical operating system developed and marketed by Apple Inc. since 2001. It is the primary operating system for Apple's Mac computers. Within the market of desktop and laptop computers it is the second most widely used desktop OS, after Windows NT and ahead of Chrome OS","https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/MacOS_wordmark_%282017%29.svg/640px-MacOS_wordmark_%282017%29.svg.png","Apple Inc","https://www.apple.com/macos/monterey/","Propietary", R.drawable.macos_logo));
        systems.add(new System("CentOS", "CentOS 8",
                "CentOS (/ˈsɛntɒs/, from Community Enterprise Operating System)[5][6] is a Linux distribution that provides a free and open-source community-supported computing platform, functionally compatible with its upstream source, Red Hat Enterprise Linux (RHEL).[7][8] In January 2014, CentOS announced the official joining with Red Hat while staying independent from RHEL,[9] under a new CentOS governing board.[10][11]","https://upload.wikimedia.org/wikipedia/commons/thumb/b/bf/Centos-logo-light.svg/658px-Centos-logo-light.svg.png","The CentOS project","https://centos.org/","Open Source", R.drawable.centos_logo));
        systems.add(new System("Ubuntu Linux", "21.10 Impish Indri",
                "Ubuntu (/ʊˈbʊntuː/ (About this soundlisten) uu-BUUN-too)[6] (Stylized as ubuntu) is a Linux distribution based on Debian and composed mostly of free and open-source software.[7][8][9] Ubuntu is officially released in three editions: Desktop,[10] Server,[11] and Core[12] for Internet of things devices[13] and robots.[14][15] All the editions can run on the computer alone, or in a virtual machine. Ubuntu is a popular operating system for cloud computing, with support for OpenStack. Ubuntu's default desktop has been GNOME, since version 17.10","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Logo-ubuntu_no%28r%29-black_orange-hex.svg/758px-Logo-ubuntu_no%28r%29-black_orange-hex.svg.png","Canonical Ltd","https://ubuntu.com/","Open Source", R.drawable.ubuntu_logo));
        systems.add(new System("ChromeOS", "Version 96.0.4664.77",
                "Chrome OS (sometimes styled as chromeOS) is a Gentoo Linux-based operating system designed by Google. It is derived from the free software Chromium OS and uses the Google Chrome web browser as its principal user interface. Unlike Chromium OS, Chrome OS is proprietary software.\\n\\nGoogle announced the project, based on Ubuntu,[8] in July 2009, conceiving it as an operating system in which both applications and user data reside in the cloud: hence Chrome OS primarily runs web applications.[9] Source code and a public demo came that November. The first Chrome OS laptop, known as a Chromebook, arrived in May 2011. Initial Chromebook shipments from Samsung and Acer occurred in July 2011.","https://upload.wikimedia.org/wikipedia/en/e/e2/The_Chrome_OS_logo_as_of_2020.png","Google","https://www.google.com/chromebook/chrome-os/","propietary", R.drawable.chromeos_logo));
        systems.add(new System("Oracle Solaris", "Oracle Solaris 11.4",
                "Solaris is a proprietary Unix operating system originally developed by Sun Microsystems. After the Sun acquisition by Oracle in 2010, it was renamed Oracle Solaris.[3]\\n\\nSolaris superseded the company's earlier SunOS in 1993, and became known for its scalability, especially on SPARC systems, and for originating many innovative features such as DTrace, ZFS and Time Slider.[4][5] Solaris supports SPARC and x86-64 workstations and servers from Oracle and other vendors. Solaris was registered as compliant with UNIX 03 until 29 April 2019.[6][7][8]","https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Oracle_Solaris_logo.svg/329px-Oracle_Solaris_logo.svg.png","Oracle","https://www.oracle.com/solaris/solaris11/","mixed", R.drawable.oracle_logo));
        systems.add(new System("FreeBSD","Free BSD 13.0",
                "FreeBSD is a free and open-source Unix-like operating system descended from the Berkeley Software Distribution (BSD), which was based on Research Unix. The first version of FreeBSD was released in 1993. In 2005, FreeBSD was the most popular open-source BSD operating system, accounting for more than three-quarters of all installed simply, permissively licensed BSD systems.[4]\\n\\nFreeBSD has similarities with Linux, with two major differences in scope and licensing: FreeBSD maintains a complete system, i.e. the project delivers a kernel, device drivers, userland utilities, and documentation, as opposed to Linux only delivering a kernel and drivers, and relying on third-parties for system software;[5] and FreeBSD source code is generally released under a permissive BSD license, as opposed to the copyleft GPL used by Linux.","https://upload.wikimedia.org/wikipedia/en/thumb/d/df/Freebsd_logo.svg/500px-Freebsd_logo.svg.png","The FreeBSD Project","https://www.freebsd.org/","Open Source", R.drawable.freebsd_logo));
    }


    public static List<System> getAllsystems(Context ctx) {
        if (systems.size() == 0) {
            initDataSystem(ctx);
        }
        return systems;
    }

}