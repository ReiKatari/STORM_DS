package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l40  reason: default package */
/* loaded from: classes.dex */
public final class l40 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public l40(Context context, zd zdVar) {
        this.a = 1;
        this.d = zdVar;
        this.b = 0;
        this.e = new GestureDetector(context, new xy2(this));
    }

    public void a(int i) {
        int i2 = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.W.get()).postOnAnimation((es4) obj);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((tm3) obj);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public l40(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new es4(3, this);
    }

    public l40(SideSheetBehavior sideSheetBehavior) {
        this.a = 2;
        this.e = sideSheetBehavior;
        this.d = new tm3(9, this);
    }
}
