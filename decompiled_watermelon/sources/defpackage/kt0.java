package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kt0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kt0 implements dj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ kt0(int i) {
        this.A = i;
    }

    @Override // defpackage.dj2
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
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
        o27 o27Var = o27.a;
        switch (i3) {
            case 0:
                mo6 mo6Var = (mo6) obj;
                ao6 ao6Var = (ao6) obj2;
                ki2 ki2Var = (ki2) obj3;
                tu0 tu0Var = (tu0) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = ((sk2) tu0Var).f(mo6Var);
                    } else {
                        h2 = ((sk2) tu0Var).h(mo6Var);
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
                        h = ((sk2) tu0Var).f(ao6Var);
                    } else {
                        h = ((sk2) tu0Var).h(ao6Var);
                    }
                    if (h) {
                        i5 = 32;
                    }
                    i |= i5;
                }
                if ((intValue & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                    if (((sk2) tu0Var).h(ki2Var)) {
                        i4 = 256;
                    }
                    i |= i4;
                }
                if ((i & 1171) != 1170) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(i & 1, z)) {
                    xb1.c(mo6Var, ao6Var, ki2Var, sk2Var, i & 1022);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                mo6 mo6Var2 = (mo6) obj;
                ao6 ao6Var2 = (ao6) obj2;
                ki2 ki2Var2 = (ki2) obj3;
                tu0 tu0Var2 = (tu0) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h4 = ((sk2) tu0Var2).f(mo6Var2);
                    } else {
                        h4 = ((sk2) tu0Var2).h(mo6Var2);
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
                        h3 = ((sk2) tu0Var2).f(ao6Var2);
                    } else {
                        h3 = ((sk2) tu0Var2).h(ao6Var2);
                    }
                    if (h3) {
                        i5 = 32;
                    }
                    i2 |= i5;
                }
                if ((intValue2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                    if (((sk2) tu0Var2).h(ki2Var2)) {
                        i4 = 256;
                    }
                    i2 |= i4;
                }
                if ((i2 & 1171) != 1170) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(i2 & 1, z)) {
                    xb1.c(mo6Var2, ao6Var2, ki2Var2, sk2Var2, i2 & 1022);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((vr6) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(vr6.f(j), vr6.e(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return o27Var;
        }
    }
}
