package defpackage;

import android.view.KeyEvent;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m7  reason: default package */
/* loaded from: classes.dex */
public final class m7 implements mi2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ int B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ k24 R;
    public final /* synthetic */ sd3 X;

    public m7(List list, int i, mi2 mi2Var, k24 k24Var, sd3 sd3Var) {
        this.A = list;
        this.B = i;
        this.L = mi2Var;
        this.R = k24Var;
        this.X = sd3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        KeyEvent keyEvent = ((da3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (hi2.C(keyEvent) == 2 && ((Boolean) this.R.getValue()).booleanValue()) {
            long f = jk2.f(keyEvent.getKeyCode());
            if (r93.a(f, r93.f)) {
                i = -1;
            } else if (r93.a(f, r93.g)) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.X != sd3.Ltr) {
                i = -i;
            }
            if (i != 0) {
                List list = this.A;
                int size = list.size();
                int i2 = this.B + i;
                if (i2 >= 0 && i2 < size) {
                    this.L.n(Long.valueOf(((c6) list.get(i2)).a));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
