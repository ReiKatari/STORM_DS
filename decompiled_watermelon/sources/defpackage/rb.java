package defpackage;

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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb  reason: default package */
/* loaded from: classes.dex */
public final class rb {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final boolean F;
    public final og1 G;
    public final Context a;
    public final tb b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public AlertController$RecycleListView f;
    public View g;
    public int h;
    public Button j;
    public CharSequence k;
    public Message l;
    public Button m;
    public CharSequence n;
    public Message o;
    public Button p;
    public CharSequence q;
    public Message r;
    public NestedScrollView s;
    public Drawable t;
    public ImageView u;
    public TextView v;
    public TextView w;
    public View x;
    public ListAdapter y;
    public boolean i = false;
    public int z = -1;
    public final q7 H = new q7(1, this);

    public rb(Context context, tb tbVar, Window window) {
        this.a = context;
        this.b = tbVar;
        this.c = window;
        og1 og1Var = new og1();
        og1Var.b = new WeakReference(tbVar);
        this.G = og1Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, by4.e, R.attr.alertDialogStyle, 0);
        this.A = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.B = obtainStyledAttributes.getResourceId(4, 0);
        this.C = obtainStyledAttributes.getResourceId(5, 0);
        this.D = obtainStyledAttributes.getResourceId(7, 0);
        this.E = obtainStyledAttributes.getResourceId(3, 0);
        this.F = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        tbVar.g().g(1);
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

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.G.obtainMessage(i, onClickListener);
        } else {
            message = null;
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.k = charSequence;
                    this.l = message;
                    return;
                }
                i.i("Button does not exist");
                return;
            }
            this.n = charSequence;
            this.o = message;
            return;
        }
        this.q = charSequence;
        this.r = message;
    }
}
