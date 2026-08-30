package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: je1  reason: default package */
/* loaded from: classes.dex */
public final class je1 implements PointerInputEventHandler {
    public static final je1 b = new je1(0);
    public static final je1 c = new je1(1);
    public final /* synthetic */ int a;

    public /* synthetic */ je1(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(vp4 vp4Var, j11 j11Var) {
        int i = this.a;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                Object d = xm6.d(vp4Var, null, new nl0(21), j11Var, 7);
                if (d == p31.COROUTINE_SUSPENDED) {
                    return d;
                }
                return o27Var;
            default:
                return o27Var;
        }
    }
}
