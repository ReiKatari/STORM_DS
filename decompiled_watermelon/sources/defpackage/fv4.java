package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fv4  reason: default package */
/* loaded from: classes.dex */
public final class fv4 extends FrameLayout {
    public static final Object L = new Object();
    public final ArrayList A;
    public ev4 B;

    public fv4(Context context, List list) {
        super(context);
        this.A = new ArrayList();
        setProtections(list);
    }

    private ll6 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ll6) {
            return (ll6) tag;
        }
        ll6 ll6Var = new ll6(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, ll6Var);
        return ll6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[LOOP:0: B:7:0x0028->B:27:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.A
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r13.b()
            return
        Lc:
            ll6 r1 = r13.getOrInstallSystemBarStateMonitor()
            r13.b()
            ev4 r2 = new ev4
            r2.<init>(r1, r0)
            r13.B = r2
            int r0 = r13.getChildCount()
            ev4 r1 = r13.B
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L28:
            if (r3 >= r1) goto Lc1
            ev4 r4 = r13.B
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            zq0 r4 = (defpackage.zq0) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            dv4 r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 8
            r10 = -1
            if (r4 == r8) goto L67
            r8 = 2
            if (r4 == r8) goto L62
            r8 = 4
            if (r4 == r8) goto L5b
            if (r4 != r9) goto L51
            int r4 = r7.b
            r8 = 80
            goto L6b
        L51:
            java.lang.String r13 = "Unexpected side: "
            java.lang.String r13 = defpackage.wh1.g(r4, r13)
            defpackage.i.i(r13)
            return
        L5b:
            int r4 = r7.a
            r8 = 5
        L5e:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L6b
        L62:
            int r4 = r7.b
            r8 = 48
            goto L6b
        L67:
            int r4 = r7.a
            r8 = 3
            goto L5e
        L6b:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            x13 r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.fv4.L
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto La0
            r9 = r2
        La0:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            ci3 r5 = new ci3
            r8 = 15
            r5.<init>(r8, r11, r4)
            ci3 r8 = r7.i
            if (r8 != 0) goto Lbc
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L28
        Lbc:
            java.lang.String r13 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            defpackage.i.n(r13)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv4.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int i2;
        if (view != null && view.getTag() != L) {
            ev4 ev4Var = this.B;
            if (ev4Var != null) {
                i2 = ev4Var.a.size();
            } else {
                i2 = 0;
            }
            int childCount = getChildCount() - i2;
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b() {
        ev4 ev4Var;
        if (this.B != null) {
            removeViews(getChildCount() - this.B.a.size(), this.B.a.size());
            int size = this.B.a.size();
            int i = 0;
            while (true) {
                ev4Var = this.B;
                if (i >= size) {
                    break;
                }
                ((zq0) ev4Var.a.get(i)).b.i = null;
                i++;
            }
            ArrayList arrayList = ev4Var.a;
            if (!ev4Var.f) {
                ev4Var.f = true;
                ev4Var.b.b.remove(ev4Var);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((zq0) arrayList.get(size2)).e = null;
                }
                arrayList.clear();
            }
            this.B = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof ll6) {
            ll6 ll6Var = (ll6) tag;
            if (!ll6Var.b.isEmpty()) {
                return;
            }
            ll6Var.a.post(new tm3(12, ll6Var));
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    public void setProtections(List<zq0> list) {
        ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
