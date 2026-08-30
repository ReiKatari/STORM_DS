package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in2  reason: default package */
/* loaded from: classes.dex */
public final class in2 {
    public final fw a = w81.g(new yd6(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009a, code lost:
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ed A[LOOP:0: B:44:0x0057->B:97:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.in2 r18, defpackage.ja r19, defpackage.kb r20, defpackage.gy r21, defpackage.x82 r22, java.util.List r23, java.util.List r24, java.util.List r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, int r29) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in2.b(in2, ja, kb, gy, x82, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    public final LinkedHashMap a() {
        yd6 yd6Var = (yd6) this.a.a;
        yd6Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ja jaVar = yd6Var.a;
        if (jaVar != null) {
            int i = jaVar.a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        kb kbVar = yd6Var.b;
        if (kbVar != null) {
            int i2 = kbVar.a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(i2));
        }
        gy gyVar = yd6Var.c;
        if (gyVar != null) {
            int i3 = gyVar.a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(i3));
        }
        x82 x82Var = yd6Var.d;
        if (x82Var != null) {
            int i4 = x82Var.a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(i4));
        }
        List list = yd6Var.e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = yd6Var.f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = yd6Var.g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = yd6Var.h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = yd6Var.j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
