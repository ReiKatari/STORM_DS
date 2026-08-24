package com.google.mlkit.vision.text.pipeline;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbaaj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbf {
    public static Rect zba(List list, Matrix matrix) {
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
        RectF rectF = new RectF(i2, i3, i, i4);
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static zbpb zbb(zbaaj zbaajVar) {
        if (zbaajVar.zbi()) {
            return zbaajVar.zbc().zbd();
        }
        if (zbaajVar.zbH()) {
            return zbaajVar.zbf().zbc();
        }
        return zbaajVar.zbe();
    }

    public static List zbc(zbpb zbpbVar) {
        double sin = Math.sin(Math.toRadians(zbpbVar.zba()));
        double cos = Math.cos(Math.toRadians(zbpbVar.zba()));
        Point point = new Point((int) (zbpbVar.zbd() + (zbpbVar.zbf() * cos)), (int) ((zbpbVar.zbf() * sin) + zbpbVar.zbe()));
        double d = point.x;
        double zbc = zbpbVar.zbc() * sin;
        double zbc2 = zbpbVar.zbc() * cos;
        Point point2 = r0[0];
        int i = point2.x;
        Point point3 = r0[2];
        int i2 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zbpbVar.zbd(), zbpbVar.zbe()), point, new Point((int) (d - zbc), (int) (zbc2 + pointArr[1].y)), new Point((i2 - point4.x) + i, (point3.y - point4.y) + point2.y)};
        return Arrays.asList(pointArr);
    }
}
