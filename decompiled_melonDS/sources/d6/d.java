package d6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends FrameLayout {
    public static final Object L = new Object();
    public final ArrayList A;
    public c B;

    public d(Context context, List list) {
        super(context);
        this.A = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[LOOP:0: B:6:0x0023->B:26:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.A
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lbc
        La:
            d6.g r1 = r13.getOrInstallSystemBarStateMonitor()
            d6.c r2 = new d6.c
            r2.<init>(r1, r0)
            r13.B = r2
            int r0 = r13.getChildCount()
            d6.c r1 = r13.B
            java.util.ArrayList r1 = r1.f3907a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lbc
            d6.c r4 = r13.B
            java.util.ArrayList r4 = r4.f3907a
            java.lang.Object r4 = r4.get(r3)
            d6.a r4 = (d6.a) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            d6.b r7 = r4.f3891b
            int r4 = r4.f3890a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L62
            r8 = 2
            if (r4 == r8) goto L5d
            if (r4 == r9) goto L56
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.f3899b
            r8 = 80
            goto L66
        L4c:
            java.lang.String r0 = "Unexpected side: "
            java.lang.String r0 = w.d.l(r4, r0)
            a0.j.h(r0)
            return
        L56:
            int r4 = r7.f3898a
            r8 = 5
        L59:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L66
        L5d:
            int r4 = r7.f3899b
            r8 = 48
            goto L66
        L62:
            int r4 = r7.f3898a
            r8 = 3
            goto L59
        L66:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            q5.b r4 = r7.f3900c
            int r8 = r4.f12283a
            r11.leftMargin = r8
            int r8 = r4.f12284b
            r11.topMargin = r8
            int r8 = r4.f12285c
            r11.rightMargin = r8
            int r4 = r4.f12286d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = d6.d.L
            r4.setTag(r5)
            float r5 = r7.f3903f
            r4.setTranslationX(r5)
            float r5 = r7.f3904g
            r4.setTranslationY(r5)
            float r5 = r7.f3905h
            r4.setAlpha(r5)
            boolean r5 = r7.f3901d
            if (r5 == 0) goto L9b
            r9 = r2
        L9b:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.f3902e
            r4.setBackground(r5)
            a0.g r5 = new a0.g
            r8 = 11
            r5.<init>(r8, r11, r4)
            a0.g r8 = r7.f3906i
            if (r8 != 0) goto Lb7
            r7.f3906i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb7:
            java.lang.String r0 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            a0.j.p(r0)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.d.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        int i10;
        if (view != null && view.getTag() != L) {
            c cVar = this.B;
            if (cVar != null) {
                i10 = cVar.f3907a.size();
            } else {
                i10 = 0;
            }
            int childCount = getChildCount() - i10;
            if (i2 > childCount || i2 < 0) {
                i2 = childCount;
            }
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b() {
        c cVar;
        if (this.B != null) {
            removeViews(getChildCount() - this.B.f3907a.size(), this.B.f3907a.size());
            int size = this.B.f3907a.size();
            int i2 = 0;
            while (true) {
                cVar = this.B;
                if (i2 >= size) {
                    break;
                }
                ((a) cVar.f3907a.get(i2)).f3891b.f3906i = null;
                i2++;
            }
            ArrayList arrayList = cVar.f3907a;
            if (!cVar.f3912f) {
                cVar.f3912f = true;
                cVar.f3908b.f3914b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f3894e = null;
                }
                arrayList.clear();
            }
            this.B = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (!gVar.f3914b.isEmpty()) {
                return;
            }
            gVar.f3913a.post(new a8.f(11, gVar));
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}
