package g1;

import b3.m;
import mc.q;
import mc.v;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements v {
    @Override // mc.v
    public final Object q(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, r rVar, Integer num) {
        int i2;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        c cVar = (c) obj2;
        q qVar = (q) obj3;
        mc.a aVar = (mc.a) obj4;
        int intValue = num.intValue();
        int i16 = intValue & 6;
        m mVar = m.f1770a;
        if (i16 == 0) {
            if (rVar.f(mVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i2 = i15 | intValue;
        } else {
            i2 = intValue;
        }
        if ((intValue & 48) == 0) {
            if (rVar.f(str)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i2 |= i14;
        }
        if ((intValue & 384) == 0) {
            if (rVar.g(booleanValue)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i2 |= i13;
        }
        if ((intValue & 3072) == 0) {
            if (rVar.f(cVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i2 |= i12;
        }
        if ((intValue & 24576) == 0) {
            if (rVar.h(qVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i2 |= i11;
        }
        if ((intValue & 196608) == 0) {
            if (rVar.h(aVar)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i2 |= i10;
        }
        if ((599187 & i2) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            i.c(str, booleanValue, cVar, mVar, qVar, aVar, rVar, ((i2 >> 3) & 1022) | ((i2 << 9) & 7168) | (57344 & i2) | (i2 & 458752));
        } else {
            rVar.R();
        }
        return y.f14813a;
    }
}
