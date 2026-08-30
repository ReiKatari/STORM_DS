package l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final androidx.preference.v G;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8388a;

    /* renamed from: b  reason: collision with root package name */
    public final g f8389b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f8390c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f8391d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f8392e;

    /* renamed from: f  reason: collision with root package name */
    public AlertController$RecycleListView f8393f;

    /* renamed from: g  reason: collision with root package name */
    public View f8394g;

    /* renamed from: h  reason: collision with root package name */
    public int f8395h;

    /* renamed from: j  reason: collision with root package name */
    public Button f8397j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f8398k;

    /* renamed from: l  reason: collision with root package name */
    public Message f8399l;
    public Button m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f8400n;

    /* renamed from: o  reason: collision with root package name */
    public Message f8401o;

    /* renamed from: p  reason: collision with root package name */
    public Button f8402p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f8403q;

    /* renamed from: r  reason: collision with root package name */
    public Message f8404r;

    /* renamed from: s  reason: collision with root package name */
    public NestedScrollView f8405s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f8406t;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f8407u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f8408v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f8409w;

    /* renamed from: x  reason: collision with root package name */
    public View f8410x;

    /* renamed from: y  reason: collision with root package name */
    public ListAdapter f8411y;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8396i = false;

    /* renamed from: z  reason: collision with root package name */
    public int f8412z = -1;
    public final com.google.android.material.datepicker.l H = new com.google.android.material.datepicker.l(1, this);

    public f(Context context, g gVar, Window window) {
        this.f8388a = context;
        this.f8389b = gVar;
        this.f8390c = window;
        androidx.preference.v vVar = new androidx.preference.v();
        vVar.f1596b = new WeakReference(gVar);
        this.G = vVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, k.a.f7915e, R.attr.alertDialogStyle, 0);
        this.A = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.B = obtainStyledAttributes.getResourceId(4, 0);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(7, 0);
        this.E = obtainStyledAttributes.getResourceId(3, 0);
        this.F = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.f().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.G.obtainMessage(i2, onClickListener);
        } else {
            message = null;
        }
        if (i2 != -3) {
            if (i2 != -2) {
                if (i2 == -1) {
                    this.f8398k = charSequence;
                    this.f8399l = message;
                    return;
                }
                a0.j.h("Button does not exist");
                return;
            }
            this.f8400n = charSequence;
            this.f8401o = message;
            return;
        }
        this.f8403q = charSequence;
        this.f8404r = message;
    }
}
