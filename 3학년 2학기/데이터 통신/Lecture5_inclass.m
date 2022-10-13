

%% 1st problem

result1 = Calsum(10)


%% 2nd problem

result21 = chkPrime(10)
result22 = chkPrime(13)

%% 3rd problem

fs = 100;
Tmax = 2;
t = [ 1/fs : 1/fs : Tmax];  % 1x200
y = cos(2*pi*t);            % 1x200
z = sin(2*pi*t);            % 1x200
figure(1)
% plot(t,y,'bx',t,z,'ro');
plot(t,y,'bx');
hold on;
plot(t,z,'go');
title('100Hz sampling');
xlabel('time');
ylabel('value');

%% 4th problem
symbol = 3+3j;
Ts = 1;
fs = 10;
t = [1/fs:1/fs:Ts];
y = real(symbol)*cos(2*pi/Ts*t) - imag(symbol)*sin(2*pi/Ts*t);
figure(2)
plot(t,y,'o');
title('10Hz sampling');
xlabel('time');
ylabel('value');


%% Exercise


