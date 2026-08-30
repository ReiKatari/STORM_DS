package defpackage;

import android.os.LocaleList;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd  reason: default package */
/* loaded from: classes.dex */
public final class vd extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ ee L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd(ee eeVar, int i) {
        super(0);
        this.B = i;
        this.L = eeVar;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int actionMasked;
        int i = this.B;
        ee eeVar = this.L;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) eeVar.o0.getValue();
                bool.getClass();
                return bool;
            case 1:
                LocaleList locales = eeVar.getConfiguration().getLocales();
                gr3 gr3Var = new gr3(new hr3(locales));
                if (locales.isEmpty()) {
                    gr3Var = new gr3(new hr3(LocaleList.getDefault()));
                }
                hr3 hr3Var = gr3Var.a;
                int size = hr3Var.a.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Locale locale = hr3Var.a.get(i2);
                    locale.getClass();
                    arrayList.add(new er3(locale));
                }
                return new fr3(arrayList);
            case 2:
                MotionEvent motionEvent = eeVar.q1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    eeVar.r1 = SystemClock.uptimeMillis();
                    eeVar.post(eeVar.w1);
                }
                return o27.a;
            default:
                eeVar.get_viewTreeOwners();
                return null;
        }
    }
}
