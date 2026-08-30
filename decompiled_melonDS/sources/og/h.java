package og;

import ai.s0;
import android.view.KeyEvent;
import android.view.WindowManager;
import n2.f1;
import n2.p1;
import n2.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends b4.a {

    /* renamed from: f0  reason: collision with root package name */
    public final WindowManager f11000f0;

    /* renamed from: g0  reason: collision with root package name */
    public final WindowManager.LayoutParams f11001g0;

    /* renamed from: h0  reason: collision with root package name */
    public mc.a f11002h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f11003i0;

    /* renamed from: j0  reason: collision with root package name */
    public final f1 f11004j0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(android.view.View r3, boolean r4, java.util.UUID r5) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 0
            r2.<init>(r0, r1)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            r0.getClass()
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r2.f11000f0 = r0
            android.view.WindowManager$LayoutParams r0 = new android.view.WindowManager$LayoutParams
            r0.<init>()
            r1 = 512(0x200, float:7.17E-43)
            r0.flags = r1
            r1 = 1000(0x3e8, float:1.401E-42)
            r0.type = r1
            if (r4 == 0) goto L32
            r4 = 2131951926(0x7f130136, float:1.954028E38)
            goto L35
        L32:
            r4 = 2131951925(0x7f130135, float:1.9540278E38)
        L35:
            r0.windowAnimations = r4
            android.os.IBinder r4 = r3.getApplicationWindowToken()
            r0.token = r4
            r4 = -1
            r0.width = r4
            r0.height = r4
            r4 = -3
            r0.format = r4
            r2.f11001g0 = r0
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            r2.setId(r4)
            androidx.lifecycle.x r4 = androidx.lifecycle.s0.d(r3)
            r0 = 2131362452(0x7f0a0294, float:1.8344685E38)
            r2.setTag(r0, r4)
            androidx.lifecycle.e1 r4 = androidx.lifecycle.s0.e(r3)
            r0 = 2131362456(0x7f0a0298, float:1.8344693E38)
            r2.setTag(r0, r4)
            q7.f r3 = p7.o.j(r3)
            r4 = 2131362455(0x7f0a0297, float:1.8344691E38)
            r2.setTag(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CustomLayout:"
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4 = 2131361954(0x7f0a00a2, float:1.8343675E38)
            r2.setTag(r4, r3)
            v2.c r3 = og.a.f10987b
            n2.f1 r3 = n2.s.w(r3)
            r2.f11004j0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: og.h.<init>(android.view.View, boolean, java.util.UUID):void");
    }

    @Override // b4.a
    public final void a(n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-266009091);
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
            ((mc.p) this.f11004j0.getValue()).j(rVar, 0);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 23, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if ((keyEvent != null && keyEvent.getKeyCode() == 4) || (keyEvent != null && keyEvent.getKeyCode() == 111)) {
            mc.a aVar = this.f11002h0;
            if (aVar != null) {
                aVar.b();
                return true;
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b4.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11003i0;
    }
}
