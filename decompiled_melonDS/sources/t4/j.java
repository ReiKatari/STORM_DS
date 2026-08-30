package t4;

import android.text.TextPaint;
import i3.m0;
import i3.o;
import java.util.ArrayList;
import l4.a0;
import l4.m;
import l4.q;
import l4.r0;
import l4.s;
import l4.y;
import w4.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final k f13129a = new k(false);

    public static final boolean a(r0 r0Var) {
        m mVar;
        y yVar;
        a0 a0Var = r0Var.f8889c;
        if (a0Var != null && (yVar = a0Var.f8779b) != null) {
            mVar = new m(yVar.f8918b);
        } else {
            mVar = null;
        }
        boolean z10 = false;
        if (mVar != null && mVar.f8848a == 1) {
            z10 = true;
        }
        return !z10;
    }

    public static final void b(q qVar, i3.q qVar2, o oVar, float f8, m0 m0Var, l lVar, k3.e eVar) {
        ArrayList arrayList = qVar.f8882h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = (s) arrayList.get(i2);
            sVar.f8890a.g(qVar2, oVar, f8, m0Var, lVar, eVar);
            qVar2.k(0.0f, sVar.f8890a.b());
        }
    }

    public static final void c(TextPaint textPaint, float f8) {
        if (!Float.isNaN(f8)) {
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f8 * 255));
        }
    }
}
