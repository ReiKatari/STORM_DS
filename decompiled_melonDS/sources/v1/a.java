package v1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import l4.q0;
import mc.s;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.m;
import n2.r;
import x1.g;
import yb.y;
import z1.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s {
    public final /* synthetic */ int A;

    @Override // mc.s
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        boolean z10;
        int i10;
        boolean h2;
        int i11;
        boolean h10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean h11;
        int i15;
        boolean h12;
        int i16;
        switch (this.A) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j2 = ((q0) obj5).f8885a;
                String obj6 = ((CharSequence) obj4).subSequence(q0.f(j2), q0.e(j2)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                g gVar = (g) obj;
                b2.g gVar2 = (b2.g) obj2;
                mc.a aVar = (mc.a) obj3;
                m mVar = (m) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h10 = ((r) mVar).f(gVar);
                    } else {
                        h10 = ((r) mVar).h(gVar);
                    }
                    if (h10) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i2 = i12 | intValue;
                } else {
                    i2 = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        h2 = ((r) mVar).f(gVar2);
                    } else {
                        h2 = ((r) mVar).h(gVar2);
                    }
                    if (h2) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i2 |= i11;
                }
                if ((intValue & 384) == 0) {
                    if (((r) mVar).h(aVar)) {
                        i10 = 256;
                    } else {
                        i10 = 128;
                    }
                    i2 |= i10;
                }
                if ((i2 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(i2 & 1, z10)) {
                    k.c(gVar, gVar2, aVar, rVar, i2 & 1022);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                g gVar3 = (g) obj;
                b2.g gVar4 = (b2.g) obj2;
                mc.a aVar2 = (mc.a) obj3;
                m mVar2 = (m) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h12 = ((r) mVar2).f(gVar3);
                    } else {
                        h12 = ((r) mVar2).h(gVar3);
                    }
                    if (h12) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i13 = i16 | intValue2;
                } else {
                    i13 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        h11 = ((r) mVar2).f(gVar4);
                    } else {
                        h11 = ((r) mVar2).h(gVar4);
                    }
                    if (h11) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i13 |= i15;
                }
                if ((intValue2 & 384) == 0) {
                    if (((r) mVar2).h(aVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i13 & 1171) != 1170) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(i13 & 1, z11)) {
                    k.c(gVar3, gVar4, aVar2, rVar2, i13 & 1022);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
