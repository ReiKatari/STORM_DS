package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza {
    public static Rect zza(List list) {
        Iterator it = list.iterator();
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i2 = Math.min(i2, point.x);
            i = Math.max(i, point.x);
            i3 = Math.min(i3, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i2, i3, i, i4);
    }

    public static List zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.zze));
        double cos = Math.cos(Math.toRadians(zzfVar.zze));
        double d = zzfVar.zzc;
        Point point = new Point((int) (zzfVar.zza + (d * cos)), (int) ((d * sin) + zzfVar.zzb));
        int i = zzfVar.zzd;
        double d2 = i * sin;
        double d3 = i * cos;
        Point point2 = r0[0];
        int i2 = point2.x;
        Point point3 = r0[2];
        int i3 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (point.x - d2), (int) (d3 + pointArr[1].y)), new Point((i3 - point4.x) + i2, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }
}
