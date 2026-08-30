package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jt0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jt0 implements gj2 {
    @Override // defpackage.gj2
    public final Object e(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, sk2 sk2Var, Integer num) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        a11 a11Var = (a11) obj2;
        bj2 bj2Var = (bj2) obj3;
        ki2 ki2Var = (ki2) obj4;
        int intValue = num.intValue();
        int i8 = intValue & 6;
        wy3 wy3Var = wy3.a;
        if (i8 == 0) {
            if (sk2Var.f(wy3Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (sk2Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.g(booleanValue)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((intValue & 3072) == 0) {
            if (sk2Var.f(a11Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((intValue & 24576) == 0) {
            if (sk2Var.h(bj2Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((intValue & 196608) == 0) {
            if (sk2Var.h(ki2Var)) {
                i2 = 131072;
            } else {
                i2 = 65536;
            }
            i |= i2;
        }
        if ((599187 & i) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            f11.c(str, booleanValue, a11Var, wy3Var, bj2Var, ki2Var, sk2Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            sk2Var.R();
        }
        return o27.a;
    }
}
