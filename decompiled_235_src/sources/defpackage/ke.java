package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke  reason: default package */
/* loaded from: classes.dex */
public final class ke extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ te L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke(te teVar, int i) {
        super(0);
        this.B = i;
        this.L = teVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        int actionMasked;
        int i = this.B;
        te teVar = this.L;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) teVar.p0.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = teVar.getConfiguration().getLocales();
                hy3 hy3Var = new hy3(new iy3(locales));
                if (locales.isEmpty()) {
                    hy3Var = new hy3(new iy3(LocaleList.getDefault()));
                }
                int c = hy3Var.c();
                ArrayList arrayList = new ArrayList(c);
                for (int i2 = 0; i2 < c; i2++) {
                    Locale b = hy3Var.b(i2);
                    b.getClass();
                    arrayList.add(new fy3(b));
                }
                return new gy3(arrayList);
            case 2:
                MotionEvent motionEvent = teVar.r1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    teVar.s1 = SystemClock.uptimeMillis();
                    teVar.post(teVar.x1);
                }
                return jg7.a;
            default:
                teVar.get_viewTreeOwners();
                return null;
        }
    }
}
