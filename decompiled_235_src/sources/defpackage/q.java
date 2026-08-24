package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q  reason: default package */
/* loaded from: classes.dex */
public final class q implements kp7 {
    public int a;
    public boolean b;
    public Object c;

    @Override // defpackage.kp7
    public void a() {
        this.b = true;
    }

    @Override // defpackage.kp7
    public void b() {
        ActionBarContextView.a((ActionBarContextView) this.c);
        this.b = false;
    }

    @Override // defpackage.kp7
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.e0 = null;
        ActionBarContextView.b(actionBarContextView, this.a);
    }

    public void d(Object obj) {
        obj.getClass();
        int i = this.a;
        int i2 = i + 1;
        Object[] objArr = (Object[]) this.c;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.c = Arrays.copyOf(objArr, i3);
            this.b = false;
        } else if (this.b) {
            this.c = (Object[]) objArr.clone();
            this.b = false;
        }
        int i4 = this.a;
        this.a = i4 + 1;
        ((Object[]) this.c)[i4] = obj;
    }
}
