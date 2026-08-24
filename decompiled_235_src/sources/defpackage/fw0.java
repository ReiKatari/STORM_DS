package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fw0 implements ho2 {
    public final /* synthetic */ int A;

    public /* synthetic */ fw0(int i) {
        this.A = i;
    }

    @Override // defpackage.ho2
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean h;
        boolean h2;
        int i2;
        boolean h3;
        boolean h4;
        int i3 = this.A;
        boolean z = false;
        int i4 = 128;
        int i5 = 16;
        int i6 = 2;
        jg7 jg7Var = jg7.a;
        switch (i3) {
            case 0:
                x07 x07Var = (x07) obj;
                m07 m07Var = (m07) obj2;
                on2 on2Var = (on2) obj3;
                px0 px0Var = (px0) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = ((xq2) px0Var).f(x07Var);
                    } else {
                        h2 = ((xq2) px0Var).h(x07Var);
                    }
                    if (h2) {
                        i6 = 4;
                    }
                    i = intValue | i6;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        h = ((xq2) px0Var).f(m07Var);
                    } else {
                        h = ((xq2) px0Var).h(m07Var);
                    }
                    if (h) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                    if (((xq2) px0Var).h(on2Var)) {
                        i4 = 256;
                    }
                    i |= i4;
                }
                if ((i & 1171) != 1170) {
                    z = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    vf1.c(x07Var, m07Var, on2Var, xq2Var, i & 1022);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                x07 x07Var2 = (x07) obj;
                m07 m07Var2 = (m07) obj2;
                on2 on2Var2 = (on2) obj3;
                px0 px0Var2 = (px0) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h4 = ((xq2) px0Var2).f(x07Var2);
                    } else {
                        h4 = ((xq2) px0Var2).h(x07Var2);
                    }
                    if (h4) {
                        i6 = 4;
                    }
                    i2 = intValue2 | i6;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        h3 = ((xq2) px0Var2).f(m07Var2);
                    } else {
                        h3 = ((xq2) px0Var2).h(m07Var2);
                    }
                    if (h3) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((intValue2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                    if (((xq2) px0Var2).h(on2Var2)) {
                        i4 = 256;
                    }
                    i2 |= i4;
                }
                if ((i2 & 1171) != 1170) {
                    z = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i2 & 1, z)) {
                    vf1.c(x07Var2, m07Var2, on2Var2, xq2Var2, i2 & 1022);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((k47) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(k47.f(j), k47.e(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return jg7Var;
        }
    }
}
