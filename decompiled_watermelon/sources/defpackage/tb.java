package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tb  reason: default package */
/* loaded from: classes.dex */
public final class tb extends bt0 implements DialogInterface, aq {
    public tq X;
    public final uq Y;
    public final rb Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [uq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tb(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = i(r5, r6)
            r0 = 1
            r1 = 2130969006(0x7f0401ae, float:1.7546682E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            uq r2 = new uq
            r2.<init>()
            r4.Y = r2
            hq r2 = r4.g()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            tq r5 = (defpackage.tq) r5
            r5.N0 = r6
            r2.d()
            rb r5 = new rb
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.Z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        tq tqVar = (tq) g();
        tqVar.v();
        ((ViewGroup) tqVar.u0.findViewById(16908290)).addView(view, layoutParams);
        tqVar.h0.a(tqVar.g0.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        g().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return cg2.x(this.Y, getWindow().getDecorView(), this, keyEvent);
    }

    public final Button f(int i) {
        rb rbVar = this.Z;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    rbVar.getClass();
                    return null;
                }
                return rbVar.j;
            }
            return rbVar.m;
        }
        return rbVar.p;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        tq tqVar = (tq) g();
        tqVar.v();
        return tqVar.g0.findViewById(i);
    }

    public final hq g() {
        if (this.X == null) {
            k06 k06Var = hq.A;
            this.X = new tq(getContext(), getWindow(), this, this);
        }
        return this.X;
    }

    public final void h(Bundle bundle) {
        g().a();
        super.onCreate(bundle);
        g().d();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        g().b();
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().k(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        ListAdapter listAdapter;
        int i2;
        int i3;
        View findViewById;
        View findViewById2;
        h(bundle);
        rb rbVar = this.Z;
        rbVar.b.setContentView(rbVar.A);
        Context context = rbVar.a;
        Window window = rbVar.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = rbVar.g;
        int i4 = 0;
        if (view == null) {
            if (rbVar.h != 0) {
                view = LayoutInflater.from(context).inflate(rbVar.h, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !rb.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (rbVar.i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (rbVar.f != null) {
                ((LinearLayout.LayoutParams) ((ao3) viewGroup.getLayoutParams())).weight = RecyclerView.A1;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = rb.b(findViewById7, findViewById4);
        ViewGroup b2 = rb.b(findViewById8, findViewById5);
        ViewGroup b3 = rb.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        rbVar.s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        rbVar.s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        rbVar.w = textView;
        if (textView != null) {
            CharSequence charSequence = rbVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                rbVar.s.removeView(rbVar.w);
                if (rbVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) rbVar.s.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(rbVar.s);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(rbVar.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        rbVar.j = button;
        q7 q7Var = rbVar.H;
        button.setOnClickListener(q7Var);
        boolean isEmpty = TextUtils.isEmpty(rbVar.k);
        Button button2 = rbVar.j;
        if (isEmpty) {
            button2.setVisibility(8);
            z2 = false;
        } else {
            button2.setText(rbVar.k);
            rbVar.j.setVisibility(0);
            z2 = true;
        }
        Button button3 = (Button) b3.findViewById(16908314);
        rbVar.m = button3;
        button3.setOnClickListener(q7Var);
        boolean isEmpty2 = TextUtils.isEmpty(rbVar.n);
        Button button4 = rbVar.m;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(rbVar.n);
            rbVar.m.setVisibility(0);
            z2 |= true;
        }
        Button button5 = (Button) b3.findViewById(16908315);
        rbVar.p = button5;
        button5.setOnClickListener(q7Var);
        boolean isEmpty3 = TextUtils.isEmpty(rbVar.q);
        Button button6 = rbVar.p;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(rbVar.q);
            rbVar.p.setVisibility(0);
            z2 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                Button button7 = rbVar.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (z2) {
                Button button8 = rbVar.m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (z2) {
                Button button9 = rbVar.p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (!z2) {
            b3.setVisibility(8);
        }
        if (rbVar.x != null) {
            b.addView(rbVar.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            rbVar.u = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(rbVar.d) && rbVar.F) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                rbVar.v = textView2;
                textView2.setText(rbVar.d);
                Drawable drawable = rbVar.t;
                if (drawable != null) {
                    rbVar.u.setImageDrawable(drawable);
                } else {
                    rbVar.v.setPadding(rbVar.u.getPaddingLeft(), rbVar.u.getPaddingTop(), rbVar.u.getPaddingRight(), rbVar.u.getPaddingBottom());
                    rbVar.u.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                rbVar.u.setVisibility(8);
                b.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b != null && b.getVisibility() != 8) {
            i = 1;
        } else {
            i = 0;
        }
        if (b3.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 && (findViewById2 = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = rbVar.s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (rbVar.e == null && rbVar.f == null) {
                findViewById = null;
            } else {
                findViewById = b.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = rbVar.f;
        if (alertController$RecycleListView != null && (!z4 || i == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i != 0) {
                i2 = alertController$RecycleListView.getPaddingTop();
            } else {
                i2 = alertController$RecycleListView.A;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z4) {
                i3 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i3 = alertController$RecycleListView.B;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i2, paddingRight, i3);
        }
        if (!z3) {
            View view2 = rbVar.f;
            if (view2 == null) {
                view2 = rbVar.s;
            }
            if (view2 != null) {
                if (z4) {
                    i4 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = aa7.a;
                view2.setScrollIndicators(i | i4, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = rbVar.f;
        if (alertController$RecycleListView2 != null && (listAdapter = rbVar.y) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i5 = rbVar.z;
            if (i5 > -1) {
                alertController$RecycleListView2.setItemChecked(i5, true);
                alertController$RecycleListView2.setSelection(i5);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Z.s;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Z.s;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        tq tqVar = (tq) g();
        tqVar.z();
        ct3 ct3Var = tqVar.i0;
        if (ct3Var != null) {
            ct3Var.L0(false);
        }
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void setContentView(int i) {
        e();
        g().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        g().k(getContext().getString(i));
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void setContentView(View view) {
        e();
        g().i(view);
    }

    @Override // defpackage.bt0, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        g().j(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        rb rbVar = this.Z;
        rbVar.d = charSequence;
        TextView textView = rbVar.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
