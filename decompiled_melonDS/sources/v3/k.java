package v3;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13678a;

    /* renamed from: b  reason: collision with root package name */
    public final p1.a0 f13679b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13680c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13681d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13682e;

    /* renamed from: f  reason: collision with root package name */
    public int f13683f;

    public k(List list, p1.a0 a0Var) {
        int i2;
        int i10;
        int i11;
        MotionEvent a10;
        this.f13678a = list;
        this.f13679b = a0Var;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 29 && (a10 = a()) != null) {
            i2 = a10.getClassification();
        } else {
            i2 = 0;
        }
        this.f13680c = i2;
        MotionEvent a11 = a();
        if (a11 != null) {
            i10 = a11.getButtonState();
        } else {
            i10 = 0;
        }
        this.f13681d = i10;
        MotionEvent a12 = a();
        if (a12 != null) {
            i11 = a12.getMetaState();
        } else {
            i11 = 0;
        }
        this.f13682e = i11;
        MotionEvent a13 = a();
        if (a13 != null) {
            int actionMasked = a13.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i12 = 6;
                                break;
                            case l1.c.f8508d /* 9 */:
                                i12 = 4;
                                break;
                            case l1.c.f8510f /* 10 */:
                                i12 = 5;
                                break;
                        }
                    }
                    i12 = 3;
                }
                i12 = 2;
            }
            i12 = 1;
        } else {
            int size = list.size();
            while (i12 < size) {
                t tVar = (t) list.get(i12);
                if (s.d(tVar)) {
                    i12 = 2;
                } else if (s.b(tVar)) {
                    i12 = 1;
                } else {
                    i12++;
                }
            }
            i12 = 3;
        }
        this.f13683f = i12;
    }

    public final MotionEvent a() {
        p1.a0 a0Var = this.f13679b;
        if (a0Var != null) {
            return (MotionEvent) ((p1.a0) a0Var.L).L;
        }
        return null;
    }
}
