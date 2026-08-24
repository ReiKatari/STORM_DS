package defpackage;

import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ew0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ew0 implements ko2 {
    @Override // defpackage.ko2
    public final Object m(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, xq2 xq2Var, Integer num) {
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
        i41 i41Var = (i41) obj2;
        fo2 fo2Var = (fo2) obj3;
        on2 on2Var = (on2) obj4;
        int intValue = num.intValue();
        int i8 = intValue & 6;
        x64 x64Var = x64.a;
        if (i8 == 0) {
            if (xq2Var.f(x64Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i = i7 | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            if (xq2Var.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i |= i6;
        }
        if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.g(booleanValue)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i |= i5;
        }
        if ((intValue & 3072) == 0) {
            if (xq2Var.f(i41Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i |= i4;
        }
        if ((intValue & 24576) == 0) {
            if (xq2Var.h(fo2Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i |= i3;
        }
        if ((intValue & 196608) == 0) {
            if (xq2Var.h(on2Var)) {
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
        if (xq2Var.S(i & 1, z)) {
            n41.c(str, booleanValue, i41Var, x64Var, fo2Var, on2Var, xq2Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
        } else {
            xq2Var.V();
        }
        return jg7.a;
    }
}
