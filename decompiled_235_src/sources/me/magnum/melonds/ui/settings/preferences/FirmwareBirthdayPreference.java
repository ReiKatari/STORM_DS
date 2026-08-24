package me.magnum.melonds.ui.settings.preferences;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import com.stormds.emulator.R;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FirmwareBirthdayPreference extends Preference {
    public static final Map A = c14.m0(new vr4(1, 31), new vr4(2, 29), new vr4(3, 31), new vr4(4, 30), new vr4(5, 31), new vr4(6, 30), new vr4(7, 31), new vr4(8, 31), new vr4(9, 30), new vr4(10, 31), new vr4(11, 30), new vr4(12, 31));
    public static final NumberFormat B;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumIntegerDigits(2);
        B = numberInstance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareBirthdayPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public static int e(int i, boolean z, int i2) {
        int i3;
        Integer num = (Integer) A.get(Integer.valueOf(i2));
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 1;
        }
        if (z) {
            if (i > i3) {
                return 1;
            }
            if (i < 1) {
                return i3;
            }
            return i;
        }
        return gi2.q(i, 1, i3);
    }

    public static void f(TextView textView, int i) {
        textView.setText(B.format(Integer.valueOf(i)).toString());
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [yc1, java.lang.Object] */
    @Override // androidx.preference.Preference
    public final void onClick() {
        int i;
        int i2;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_birthday, (ViewGroup) null, false);
        int i3 = R.id.buttonBirthdayDayDecrease;
        Button button = (Button) gi2.B(inflate, R.id.buttonBirthdayDayDecrease);
        if (button != null) {
            i3 = R.id.buttonBirthdayDayIncrease;
            Button button2 = (Button) gi2.B(inflate, R.id.buttonBirthdayDayIncrease);
            if (button2 != null) {
                i3 = R.id.buttonBirthdayMonthDecrease;
                Button button3 = (Button) gi2.B(inflate, R.id.buttonBirthdayMonthDecrease);
                if (button3 != null) {
                    i3 = R.id.buttonBirthdayMonthIncrease;
                    Button button4 = (Button) gi2.B(inflate, R.id.buttonBirthdayMonthIncrease);
                    if (button4 != null) {
                        i3 = R.id.textBirthdayDay;
                        TextView textView = (TextView) gi2.B(inflate, R.id.textBirthdayDay);
                        if (textView != null) {
                            i3 = R.id.textBirthdayMonth;
                            TextView textView2 = (TextView) gi2.B(inflate, R.id.textBirthdayMonth);
                            if (textView2 != null) {
                                final ?? obj = new Object();
                                obj.A = textView;
                                obj.B = textView2;
                                zb zbVar = new zb(getContext());
                                ((wb) zbVar.L).d = getTitle();
                                zbVar.A((ConstraintLayout) inflate);
                                zbVar.y(R.string.ok, new nu1(1, obj, this));
                                zbVar.x(R.string.cancel, new qo0(2));
                                zbVar.B();
                                String persistedString = getPersistedString("01/01");
                                persistedString.getClass();
                                List K0 = qs6.K0(persistedString, new String[]{"/"}, 6);
                                if (K0.size() != 2) {
                                    f(textView, 1);
                                    f(textView2, 1);
                                } else {
                                    Integer h0 = xs6.h0((String) K0.get(0));
                                    if (h0 != null) {
                                        i = h0.intValue();
                                    } else {
                                        i = 1;
                                    }
                                    f(textView, i);
                                    Integer h02 = xs6.h0((String) K0.get(1));
                                    if (h02 != null) {
                                        i2 = h02.intValue();
                                    } else {
                                        i2 = 1;
                                    }
                                    f(textView2, i2);
                                }
                                button2.setOnClickListener(new View.OnClickListener(obj, this, 0) { // from class: sc2
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ yc1 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        yc1 yc1Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) yc1Var.A;
                                                Integer h03 = xs6.h0(textView3.getText().toString());
                                                if (h03 != null) {
                                                    i12 = h03.intValue();
                                                }
                                                Integer h04 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h04 != null) {
                                                    i4 = h04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) yc1Var.A;
                                                Integer h05 = xs6.h0(textView4.getText().toString());
                                                if (h05 != null) {
                                                    i11 = h05.intValue();
                                                }
                                                Integer h06 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h06 != null) {
                                                    i5 = h06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) yc1Var.A;
                                                TextView textView6 = (TextView) yc1Var.B;
                                                Integer h07 = xs6.h0(textView5.getText().toString());
                                                if (h07 != null) {
                                                    i6 = h07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer h08 = xs6.h0(textView6.getText().toString());
                                                if (h08 != null) {
                                                    i7 = h08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) yc1Var.A;
                                                TextView textView8 = (TextView) yc1Var.B;
                                                Integer h09 = xs6.h0(textView7.getText().toString());
                                                if (h09 != null) {
                                                    i8 = h09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer h010 = xs6.h0(textView8.getText().toString());
                                                if (h010 != null) {
                                                    i11 = h010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener(obj, this, 1) { // from class: sc2
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ yc1 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        yc1 yc1Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) yc1Var.A;
                                                Integer h03 = xs6.h0(textView3.getText().toString());
                                                if (h03 != null) {
                                                    i12 = h03.intValue();
                                                }
                                                Integer h04 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h04 != null) {
                                                    i4 = h04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) yc1Var.A;
                                                Integer h05 = xs6.h0(textView4.getText().toString());
                                                if (h05 != null) {
                                                    i11 = h05.intValue();
                                                }
                                                Integer h06 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h06 != null) {
                                                    i5 = h06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) yc1Var.A;
                                                TextView textView6 = (TextView) yc1Var.B;
                                                Integer h07 = xs6.h0(textView5.getText().toString());
                                                if (h07 != null) {
                                                    i6 = h07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer h08 = xs6.h0(textView6.getText().toString());
                                                if (h08 != null) {
                                                    i7 = h08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) yc1Var.A;
                                                TextView textView8 = (TextView) yc1Var.B;
                                                Integer h09 = xs6.h0(textView7.getText().toString());
                                                if (h09 != null) {
                                                    i8 = h09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer h010 = xs6.h0(textView8.getText().toString());
                                                if (h010 != null) {
                                                    i11 = h010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button4.setOnClickListener(new View.OnClickListener(obj, this, 2) { // from class: sc2
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ yc1 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        yc1 yc1Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) yc1Var.A;
                                                Integer h03 = xs6.h0(textView3.getText().toString());
                                                if (h03 != null) {
                                                    i12 = h03.intValue();
                                                }
                                                Integer h04 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h04 != null) {
                                                    i4 = h04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) yc1Var.A;
                                                Integer h05 = xs6.h0(textView4.getText().toString());
                                                if (h05 != null) {
                                                    i11 = h05.intValue();
                                                }
                                                Integer h06 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h06 != null) {
                                                    i5 = h06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) yc1Var.A;
                                                TextView textView6 = (TextView) yc1Var.B;
                                                Integer h07 = xs6.h0(textView5.getText().toString());
                                                if (h07 != null) {
                                                    i6 = h07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer h08 = xs6.h0(textView6.getText().toString());
                                                if (h08 != null) {
                                                    i7 = h08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) yc1Var.A;
                                                TextView textView8 = (TextView) yc1Var.B;
                                                Integer h09 = xs6.h0(textView7.getText().toString());
                                                if (h09 != null) {
                                                    i8 = h09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer h010 = xs6.h0(textView8.getText().toString());
                                                if (h010 != null) {
                                                    i11 = h010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button3.setOnClickListener(new View.OnClickListener(obj, this, 3) { // from class: sc2
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ yc1 B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i4;
                                        int i5;
                                        int i6;
                                        int i7;
                                        int i8;
                                        int i9 = this.A;
                                        int i10 = 12;
                                        int i11 = 2;
                                        int i12 = 0;
                                        yc1 yc1Var = this.B;
                                        switch (i9) {
                                            case 0:
                                                Map map = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) yc1Var.A;
                                                Integer h03 = xs6.h0(textView3.getText().toString());
                                                if (h03 != null) {
                                                    i12 = h03.intValue();
                                                }
                                                Integer h04 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h04 != null) {
                                                    i4 = h04.intValue();
                                                } else {
                                                    i4 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i12 + 1, true, i4));
                                                return;
                                            case 1:
                                                Map map2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) yc1Var.A;
                                                Integer h05 = xs6.h0(textView4.getText().toString());
                                                if (h05 != null) {
                                                    i11 = h05.intValue();
                                                }
                                                Integer h06 = xs6.h0(((TextView) yc1Var.B).getText().toString());
                                                if (h06 != null) {
                                                    i5 = h06.intValue();
                                                } else {
                                                    i5 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i11 - 1, true, i5));
                                                return;
                                            case 2:
                                                Map map3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) yc1Var.A;
                                                TextView textView6 = (TextView) yc1Var.B;
                                                Integer h07 = xs6.h0(textView5.getText().toString());
                                                if (h07 != null) {
                                                    i6 = h07.intValue();
                                                } else {
                                                    i6 = 1;
                                                }
                                                Integer h08 = xs6.h0(textView6.getText().toString());
                                                if (h08 != null) {
                                                    i7 = h08.intValue();
                                                } else {
                                                    i7 = 0;
                                                }
                                                int i13 = i7 + 1;
                                                if (i13 >= 1) {
                                                    if (i13 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i13;
                                                    }
                                                }
                                                int e = FirmwareBirthdayPreference.e(i6, false, i10);
                                                FirmwareBirthdayPreference.f(textView6, i10);
                                                if (e != i6) {
                                                    FirmwareBirthdayPreference.f(textView5, e);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Map map4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) yc1Var.A;
                                                TextView textView8 = (TextView) yc1Var.B;
                                                Integer h09 = xs6.h0(textView7.getText().toString());
                                                if (h09 != null) {
                                                    i8 = h09.intValue();
                                                } else {
                                                    i8 = 1;
                                                }
                                                Integer h010 = xs6.h0(textView8.getText().toString());
                                                if (h010 != null) {
                                                    i11 = h010.intValue();
                                                }
                                                int i14 = i11 - 1;
                                                if (i14 >= 1) {
                                                    if (i14 > 12) {
                                                        i10 = 1;
                                                    } else {
                                                        i10 = i14;
                                                    }
                                                }
                                                int e2 = FirmwareBirthdayPreference.e(i8, false, i10);
                                                FirmwareBirthdayPreference.f(textView8, i10);
                                                if (e2 != i8) {
                                                    FirmwareBirthdayPreference.f(textView7, e2);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }
}
