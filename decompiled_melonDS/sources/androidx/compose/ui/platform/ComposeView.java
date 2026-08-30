package androidx.compose.ui.platform;

import a0.j;
import a5.f;
import android.content.Context;
import android.util.AttributeSet;
import b4.a;
import mc.p;
import n2.f1;
import n2.m;
import n2.p1;
import n2.r;
import n2.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ComposeView extends a {

    /* renamed from: f0  reason: collision with root package name */
    public final f1 f1071f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1072g0;

    public ComposeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, (i2 & 2) != 0 ? null : attributeSet);
        this.f1071f0 = s.w(null);
    }

    @Override // b4.a
    public final void a(m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(420213850);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            p pVar = (p) this.f1071f0.getValue();
            if (pVar == null) {
                rVar.X(-1238823553);
            } else {
                rVar.X(98585282);
                pVar.j(rVar, 0);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new f(i2, 5, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // b4.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1072g0;
    }

    public final void setContent(p pVar) {
        this.f1072g0 = true;
        this.f1071f0.setValue(pVar);
        if (isAttachedToWindow()) {
            if (this.R == null && !isAttachedToWindow()) {
                j.p("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            } else {
                d();
            }
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
