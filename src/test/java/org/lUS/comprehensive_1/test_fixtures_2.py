class test_fixtures_2:
    def log(func):
        def wrapper(*args, **kwargs):
            print(f"Starting {func.__name__} function...")
            result = func(*args, **kwargs)
            print(f"Finished {func.__name__} function.")
            return result
        return wrapper

    @log
    def my_function(x, y):
        return x + y
    @log
    def my_function1(x,y):
        return x*y

    result = my_function(2, 3)
    print(result)

    result = my_function1(2, 3)
    print(result)
		