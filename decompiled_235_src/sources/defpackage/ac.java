package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
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
import com.stormds.emulator.R;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public final class ac extends hr implements DialogInterface {
    public final yb Z;

    public ac(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i(contextThemeWrapper, i));
        this.Z = new yb(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button h(int i) {
        yb ybVar = this.Z;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    ybVar.getClass();
                    return null;
                }
                return ybVar.j;
            }
            return ybVar.m;
        }
        return ybVar.p;
    }

    @Override // defpackage.hr, defpackage.qv0, android.app.Dialog
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
        super.onCreate(bundle);
        yb ybVar = this.Z;
        ybVar.b.setContentView(ybVar.A);
        Context context = ybVar.a;
        Window window = ybVar.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view = ybVar.g;
        int i4 = 0;
        if (view == null) {
            if (ybVar.h != 0) {
                view = LayoutInflater.from(context).inflate(ybVar.h, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !yb.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (ybVar.i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (ybVar.f != null) {
                ((LinearLayout.LayoutParams) ((cv3) viewGroup.getLayoutParams())).weight = RecyclerView.B1;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = yb.b(findViewById7, findViewById4);
        ViewGroup b2 = yb.b(findViewById8, findViewById5);
        ViewGroup b3 = yb.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        ybVar.s = nestedScrollView;
        nestedScrollView.setFocusable(false);
        ybVar.s.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        ybVar.w = textView;
        if (textView != null) {
            CharSequence charSequence = ybVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                ybVar.s.removeView(ybVar.w);
                if (ybVar.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) ybVar.s.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(ybVar.s);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(ybVar.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        ybVar.j = button;
        r7 r7Var = ybVar.H;
        button.setOnClickListener(r7Var);
        boolean isEmpty = TextUtils.isEmpty(ybVar.k);
        Button button2 = ybVar.j;
        if (isEmpty) {
            button2.setVisibility(8);
            z2 = false;
        } else {
            button2.setText(ybVar.k);
            ybVar.j.setVisibility(0);
            z2 = true;
        }
        Button button3 = (Button) b3.findViewById(16908314);
        ybVar.m = button3;
        button3.setOnClickListener(r7Var);
        boolean isEmpty2 = TextUtils.isEmpty(ybVar.n);
        Button button4 = ybVar.m;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(ybVar.n);
            ybVar.m.setVisibility(0);
            z2 |= true;
        }
        Button button5 = (Button) b3.findViewById(16908315);
        ybVar.p = button5;
        button5.setOnClickListener(r7Var);
        boolean isEmpty3 = TextUtils.isEmpty(ybVar.q);
        Button button6 = ybVar.p;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(ybVar.q);
            ybVar.p.setVisibility(0);
            z2 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                Button button7 = ybVar.j;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (z2) {
                Button button8 = ybVar.m;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (z2) {
                Button button9 = ybVar.p;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (!z2) {
            b3.setVisibility(8);
        }
        if (ybVar.x != null) {
            b.addView(ybVar.x, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            ybVar.u = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(ybVar.d) && ybVar.F) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                ybVar.v = textView2;
                textView2.setText(ybVar.d);
                Drawable drawable = ybVar.t;
                if (drawable != null) {
                    ybVar.u.setImageDrawable(drawable);
                } else {
                    ybVar.v.setPadding(ybVar.u.getPaddingLeft(), ybVar.u.getPaddingTop(), ybVar.u.getPaddingRight(), ybVar.u.getPaddingBottom());
                    ybVar.u.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                ybVar.u.setVisibility(8);
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
            NestedScrollView nestedScrollView2 = ybVar.s;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (ybVar.e == null && ybVar.f == null) {
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
        AlertController$RecycleListView alertController$RecycleListView = ybVar.f;
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
            View view2 = ybVar.f;
            if (view2 == null) {
                view2 = ybVar.s;
            }
            if (view2 != null) {
                if (z4) {
                    i4 = 2;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = ao7.a;
                view2.setScrollIndicators(i | i4, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = ybVar.f;
        if (alertController$RecycleListView2 != null && (listAdapter = ybVar.y) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i5 = ybVar.z;
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

    @Override // defpackage.hr, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        yb ybVar = this.Z;
        ybVar.d = charSequence;
        TextView textView = ybVar.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
